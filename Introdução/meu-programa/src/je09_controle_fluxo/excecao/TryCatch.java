package je09_controle_fluxo.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Digite seu nome: ");
            nome = input.next();
        } while (nome.equals(""));

        // java é foda hein
        if (input.hasNext()) {
            input.nextLine();
        }

        String sobrenome;
        do {
            System.out.print("Digite seu sobrenome: ");
            sobrenome = input.nextLine();
        } while (sobrenome.equals(""));

        String nomeCompleto = nome.concat(" ").concat(sobrenome).toUpperCase();

        int idade;
        while (true) {
            try {
                System.out.print("Digite sua idade: ");
                idade = input.nextInt();

                break;
            } catch (InputMismatchException ime) {
                input.next();
            }
        }

        double altura;
        while (true) {
            try {
                System.out.print("Digite sua altura: ");
                altura = input.nextDouble();

                break;
            } catch (InputMismatchException ime) {
                input.next();
            }
        }

        System.out.println("Olá, me chamo " + nomeCompleto + "!");
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");

        input.close();
    }
}
