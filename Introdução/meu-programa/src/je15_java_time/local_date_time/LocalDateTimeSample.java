package je15_java_time.local_date_time;

import java.time.LocalDateTime;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        LocalDateTime dataHora1 = LocalDateTime.of(2023, 6, 25, 16, 25);
        LocalDateTime dataHora2 = LocalDateTime.of(2023, 6, 25, 16, 25, 17);

        boolean dataHoraIgual = dataHora1.equals(dataHora2);
        System.out.println(dataHoraIgual);

        boolean dataHoraDigitoMesIgual = dataHora1.getDayOfMonth() == dataHora2.getDayOfMonth();
        System.out.println(dataHoraDigitoMesIgual);
    }
}
