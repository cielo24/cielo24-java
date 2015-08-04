package cielo24.utils;

@SuppressWarnings("serial")
public class WebException extends Exception {

    private String errorType;

    public WebException(String errType, String message) {
        super(errType + ": " + message);
        this.errorType = errType;
    }

    public String getErrorType() {
        return this.errorType;
    }
}