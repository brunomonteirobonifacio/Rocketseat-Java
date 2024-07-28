package je15_java_time.local_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterSample {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        String dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        System.out.println(data);
        System.out.println(dataFormatada);

        dataFormatada = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.of("pt", "BR")));

        System.out.println(dataFormatada);
    }
}
