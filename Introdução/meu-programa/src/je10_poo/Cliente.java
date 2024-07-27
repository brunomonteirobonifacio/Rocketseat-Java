package je10_poo;

public class Cliente {
    String nome;
    double limiteCredito;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void solicitarLimiteCredito(double valorSolicitado) {
        this.limiteCredito = valorSolicitado;
    }

    public void comprar(double valorProduto) {
        this.limiteCredito -= valorProduto;
    }
}
