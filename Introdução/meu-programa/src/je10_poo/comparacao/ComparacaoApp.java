package je10_poo.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        Integer num1 = 128;
        Integer num2 = Integer.parseInt("128");

        System.out.println(num1 == num2);       // returns false
        System.out.println(num1.equals(num2));  // returns true
    }
}
