package je10_poo.classes_essenciais;


import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
        /*String nome = null;
        Integer idade = null;
        Double peso = null;

        String linhaArquivo = "Bruno Monteiro;18;58.9";

        Scanner input = new Scanner(linhaArquivo);
        input.useDelimiter(";");

        int index = 0;
        while (input.hasNext()) {
            String info = input.next();
            switch (index) {
                case 0 -> nome = info;
                case 1 -> idade = Integer.parseInt(info);
                case 2 -> peso = Double.parseDouble(info);
            }

            index++;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);*/

        StringBuilder stringBuilder = new StringBuilder("Bruno");
        stringBuilder.append(" Monteiro Bonifácio");
    }

}
