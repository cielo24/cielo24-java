package cielo24cli.converters;

import java.io.File;

import com.beust.jcommander.IStringConverter;

public class FileConverter implements IStringConverter<File> {
	@Override
	public File convert(String path) {
		return new File(path);
	}
}