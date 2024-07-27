package je09_controle_fluxo.condicional;

public class SwitchCase {
    public static void main(String[] args) {
        String planoEscolhido = "C";

        switch (planoEscolhido.toUpperCase()) {
            case "T": {
                System.out.println("5GB YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
                break;
            }
            default: {
                System.out.println("Plano não encontrado");
                break;
            }
        }
    }
}
