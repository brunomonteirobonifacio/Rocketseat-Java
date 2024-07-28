package je14_pilares_poo;

public class MSNMessenger {
    public void enviarMensagem() {
        if (validarConectadoInternet()) {
            System.out.println("Enviando mensagem");
        } else {
            System.out.println("Computador offline");
        }
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    private boolean validarConectadoInternet() {
        System.out.println("Validando comexão de internet");
        return true;
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
