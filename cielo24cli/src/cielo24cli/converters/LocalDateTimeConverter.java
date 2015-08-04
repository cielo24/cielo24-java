package cielo24cli.converters;

import com.beust.jcommander.IStringConverter;

import javax.time.calendar.LocalDateTime;

public class LocalDateTimeConverter implements IStringConverter<LocalDateTime> {
	@Override
	public LocalDateTime convert(String arg) {
		try {
			return LocalDateTime.parse(arg);
		} catch (Exception e) {
			return null;
		}
	}
}