package je07_documentacao;

/**
* Calculadora simples
* @author Bruno M Bonifacio
* @version v1.0
*/
public class Calculadora {
    /**
    * Realiza a divisão entre dois números inteiros
    * @param dividendo  Número a ser dividido
    * @param divisor    Número que irá dividir o dividendo
    * @return           O resultado da divisão entre os dois números
    * @exception        java.lang.ArithmeticException - no caso do divisor ser 0
    */
    static int dividir(int dividendo, int divisor) {
        return dividendo / divisor;
    }
}
