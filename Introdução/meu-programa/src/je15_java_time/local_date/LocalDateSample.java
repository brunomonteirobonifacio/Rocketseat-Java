package je15_java_time.local_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate meuAniversario = LocalDate.of(2024, 6, 30);
        System.out.println(meuAniversario);                                                         // 2024-06-30

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        meuAniversario = LocalDate.parse("25/05/2005", formatter);
        System.out.println(meuAniversario);                                                         // 2005-05-25

        LocalDate meuAniversarioDe20Anos = meuAniversario.plusYears(20);

        System.out.println("Aniversario de 20 anos: " + formatter.format(meuAniversarioDe20Anos));  // 25/05/2025

    }
}
