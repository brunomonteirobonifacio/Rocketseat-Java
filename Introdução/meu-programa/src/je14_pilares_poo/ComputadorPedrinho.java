package je14_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msnMessenger = new MSNMessenger();
        msnMessenger.enviarMensagem();
        msnMessenger.receberMensagem();

        System.out.println();

        FacebookMessenger fbMessenger = new FacebookMessenger();
        fbMessenger.enviarMensagem();
        fbMessenger.receberMensagem();

        System.out.println();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
