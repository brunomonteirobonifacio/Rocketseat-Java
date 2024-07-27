package je04_hora_da_verdade;

public class ContaCorrenteApp {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();

        try {
            conta1.setNumeroConta(1);
            System.out.println(conta1.getNumeroConta());


            /*conta1.transferir();*/
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a ação: " + e.getMessage());
        }
    }
}
