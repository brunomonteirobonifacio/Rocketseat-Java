package je15_java_time.transform;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class JavaTimeTransform {
    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        esperaData(dataHora.toLocalDate());

        LocalDate localDate = LocalDate.now();
        LocalDateTime dataHoraConvertida = localDate.atTime(0, 0);
        esperaDataHora(dataHoraConvertida);
    }

    static void esperaData(LocalDate data) {

    }

    static void esperaDataHora(LocalDateTime dataHora) {

    }
}
