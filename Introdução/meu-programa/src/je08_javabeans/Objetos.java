package je08_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        try {
            aluno.setIdade(-1);
        } catch(IllegalArgumentException iae) {
            System.out.println("Erro: " + iae.getMessage());
        }
    }
}
