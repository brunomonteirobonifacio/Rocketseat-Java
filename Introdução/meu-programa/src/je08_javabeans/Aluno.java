package je08_javabeans;

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) throws IllegalArgumentException {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser menor que 0.");
        }

        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
}
