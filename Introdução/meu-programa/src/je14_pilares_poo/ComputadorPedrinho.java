package je14_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String servicoEscolhido = "tlg";

        if (servicoEscolhido.equalsIgnoreCase("msn")) {
            smi = new MSNMessenger();
        } else if (servicoEscolhido.equalsIgnoreCase("fbm")) {
            smi = new FacebookMessenger();
        } else if (servicoEscolhido.equalsIgnoreCase("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
