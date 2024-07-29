package je16_java_nio.exercicio;

public class Cliente {
    private String nome;
    private String telefone;

    Cliente(String telefone, String nome) {
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }
}
