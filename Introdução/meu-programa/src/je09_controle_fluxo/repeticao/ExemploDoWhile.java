package je09_controle_fluxo.repeticao;

import java.util.Random;

public class ExemploDoWhile {
    private static int numeroTentativas = 0;

    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");
        } while (tocando());

        System.out.println("Alô!");
    }

    private static boolean tocando() {
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(3) == 1;

        System.out.println((atendeu ? "" : "Não ").concat("Atendeu").concat(atendeu ? "!" : "..."));

        if (numeroTentativas >= 5) return false;

        return !atendeu;
    }
}
