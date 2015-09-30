package cielo24;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import com.google.common.io.Closeables;

import cielo24.utils.WebException;

public class WebUtils {

    public static final int BASIC_TIMEOUT = 60 * 1000;        // 60 seconds
    public static final int DOWNLOAD_TIMEOUT = 5 * 60 * 1000; // 5 minutes
    public final static Logger logger = Logger.getLogger("WebUtils");

    /* A synchronous method that performs an HTTP request returning data received from the sever as a String */
    public String httpRequest(URL url, HttpMethod method, int timeout) throws IOException, WebException {
        return httpRequest(url, method, timeout, new Hashtable<String, String>());
    }

    public String httpRequest(URL url, HttpMethod method, int timeout, Hashtable<String, String> headers) throws IOException, WebException {
        log(url);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        if (headers != null) {
            for (String key : headers.keySet()) {
                connection.setRequestProperty(key, headers.get(key));
            }
        }
        connection.setRequestMethod(method.toString());
        connection.setConnectTimeout(timeout);
        connection.setReadTimeout(timeout);
        connection.connect();

        return readResponse(connection);
    }

    /* Used exclusively by updatePassword method */
    public String httpRequest(URL url, HttpMethod method, int timeout, String requestBody) throws IOException, WebException {
        byte[] byteArray = requestBody.getBytes("UTF-8");
        InputStream inputStream = new ByteArrayInputStream(byteArray);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        return uploadData(url, bufferedInputStream, "password", byteArray.length);
    }

    /* Uploads data in the body of HTTP request */
    public String uploadData(URL url, BufferedInputStream inputStream, String contentType, long length) throws IOException, WebException {
        log(url);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(HttpMethod.POST.toString());
        connection.setRequestProperty("Content-Type", contentType);
        connection.setRequestProperty("Content-Length", Long.toString(length));
        connection.setFixedLengthStreamingMode(length);
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.connect();

        BufferedOutputStream outputStream = new BufferedOutputStream(connection.getOutputStream());

        // Copy contents to output stream
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        outputStream.flush();
        outputStream.close();

        return readResponse(connection);
    }

    /* Helper method */
    private String readResponse(HttpURLConnection connection) throws IOException, WebException {
        int responseCode = connection.getResponseCode();
        if (responseCode == 200 || responseCode == 204) {
            String response = readInputStream(connection.getInputStream());
            connection.disconnect();
            return response;
        } else {
            String response = readInputStream(connection.getErrorStream());
            HashMap<String, String> map = Utils.deserialize(response, Utils.hashMapType);
            connection.disconnect();
            throw new WebException(map.get("ErrorType"), map.get("ErrorComment"));
        }
    }

    /* Reads data (String) from an input stream */
    private String readInputStream(InputStream stream) throws IOException {
        try {
            return CharStreams.toString(new InputStreamReader(stream, Charsets.UTF_8));
        } finally {
            Closeables.closeQuietly(stream);
        }
    }

    /* Logs the URL */
    private void log(URL url) {
        logger.log(Level.INFO, url.toString());
    }

    public enum HttpMethod {
        GET, POST, DELETE, PUT
    }
}