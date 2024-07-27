package je09_controle_fluxo.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        // java é foda hein
        if (input.hasNext()) {
            input.nextLine();
        }

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();

        while (true) {
            try {
                System.out.print("Digite sua idade: ");
                int idade = input.nextInt();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Digite um número válido!");
                input.next();
            }
        }

        while (true) {
            try {
                System.out.print("Digite sua altura: ");
                double altura = input.nextDouble();

                break;
            } catch (InputMismatchException ime) {
                System.out.println("Digite um número válido!");
            }
        }
    }
}
