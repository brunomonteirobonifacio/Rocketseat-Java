package je15_java_time.local_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeSample {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeString = LocalTime.parse("131220", pattern);

        System.out.println("Hora extraída de string despadronizada: " + horaDeString);
        System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
