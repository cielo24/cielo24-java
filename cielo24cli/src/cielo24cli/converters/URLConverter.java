package cielo24cli.converters;

import java.net.MalformedURLException;
import java.net.URL;

import com.beust.jcommander.IStringConverter;

public class URLConverter implements IStringConverter<URL>{
	@Override
	public URL convert(String arg) {
		try {
			return new URL(arg);
		} catch (MalformedURLException e) {
			return null;
		}
	}
}