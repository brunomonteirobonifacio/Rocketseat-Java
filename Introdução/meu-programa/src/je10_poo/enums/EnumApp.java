package je10_poo.enums;

public class EnumApp {
    public static void main(String[] args) {
        EstadoBrasileiro eb = EstadoBrasileiro.SC;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());

        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.getNome());
        }
    }
}
