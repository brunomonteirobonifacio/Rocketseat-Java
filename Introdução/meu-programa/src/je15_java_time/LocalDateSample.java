package je15_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate meuAniversario = LocalDate.of(2024, 6, 30);
        System.out.println(meuAniversario);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        meuAniversario = LocalDate.parse("25/05/2005", formatter);
        System.out.println(meuAniversario);


    }
}
