package cielo24cli.converters;

import cielo24.utils.Guid;

import com.beust.jcommander.IStringConverter;

public class GuidConverter implements IStringConverter<Guid> {
	@Override
	public Guid convert(String arg) {
		return new Guid(arg);
	}
}