package je16_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path file = Paths.get("C:\\xampp\\htdocs\\Rocketseat\\curso-java\\aula-java.txt");
            List<String> nomes = new ArrayList<>();
            nomes.add("Bruno");
            nomes.add("Sla man");

            StringBuilder conteudo = new StringBuilder();
            nomes.forEach(nome -> conteudo.append(nome).append("\n"));

            Files.write(file, conteudo.toString().getBytes(StandardCharsets.UTF_8));

            List<String> linhas = Files.readAllLines(file);
            linhas.forEach(linha -> System.out.println(linha));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
