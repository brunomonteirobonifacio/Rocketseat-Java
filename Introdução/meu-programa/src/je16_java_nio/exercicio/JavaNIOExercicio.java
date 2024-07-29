package je16_java_nio.exercicio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaNIOExercicio {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\xampp\\htdocs\\Rocketseat\\curso-java\\aula-java.txt");
        Cliente joemia      = new Cliente("(83) 2148-5886", "Joemia Giron Lyrio Monnerat");
        Cliente reginaldo   = new Cliente("(21) 2705-6726", "Reginaldo Folly Barboza Brito");
        Cliente mariza      = new Cliente("(91) 2416-8455", "Mariza Gadelha Bastida Carneiro");

        List<Cliente> clientes = new ArrayList<>(Arrays.asList(joemia, reginaldo, mariza));

        StringBuilder conteudo = new StringBuilder();

        clientes.forEach(cliente -> conteudo.append(cliente.getTelefone()).append(" ").append(cliente.getNome()).append("\n"));

        try {
            Files.write(path, conteudo.toString().getBytes(StandardCharsets.UTF_8));
            List<String> linhas = Files.readAllLines(path);

            linhas.forEach(linha -> System.out.println(linha));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
