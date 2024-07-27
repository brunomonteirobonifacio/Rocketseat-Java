package je10_poo.enums;

public enum EstadoBrasileiro {
    PI("PI", "Piaui"),
    MA("MA", "Maranhao"),
    SP("SP", "Sao Paulo"),
    SC("SC", "Santa Catarina"),
    RJ("RJ", "Rio de Janeiro");

    private final String nome;
    private final String sigla;

    EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }
}
