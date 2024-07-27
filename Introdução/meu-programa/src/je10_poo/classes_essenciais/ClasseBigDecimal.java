package je10_poo.classes_essenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasseBigDecimal {
    public static void main(String[] args) {
        BigDecimal precoLitro = BigDecimal.valueOf(5.799);
        BigDecimal litrosUtilizados = BigDecimal.valueOf(21.752);

        BigDecimal valorAPagar = litrosUtilizados.multiply(precoLitro);
        System.out.println(valorAPagar);
    }
}
