package je14_pilares_poo;

public abstract class SistemaMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    private boolean validarConectadoInternet() {
        System.out.println("Validando comexão de internet");
        return true;
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens");
    }
}
