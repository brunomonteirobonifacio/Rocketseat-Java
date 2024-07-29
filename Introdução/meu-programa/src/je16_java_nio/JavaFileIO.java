package je16_java_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIO {
    public static void main(String[] args) {
        File diretorio = new File("C:\\xampp\\htdocs\\Rocketseat\\curso-java");
        System.out.println(diretorio.exists());

        if (!diretorio.exists()) {
            diretorio.mkdirs();     // cria toda a cadeia de diretórios e subdiretórios
            System.out.println("Diretório criado");
        }

        File arquivo = new File(diretorio, "aula-java.txt");
        System.out.println(arquivo.exists());

        try {
            arquivo.createNewFile();
            System.out.println(arquivo.exists());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
