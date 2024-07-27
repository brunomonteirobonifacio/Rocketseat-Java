package je10_poo.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Palio", "Branca");
        Carro carro2 = new Carro("Fiat", "Palio", "Branca");
        Carro carro3 = new Carro("Fiat", "Palio", "Branca");

        System.out.println(carro1.equals(carro2));
    }
}
