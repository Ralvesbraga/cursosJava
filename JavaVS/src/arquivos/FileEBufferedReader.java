package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEBufferedReader {
    public static void main(String[] args) {
        
        String path = "c:\\temp\\in.txt";

        //Dessa forma é fechado automaticamente o br e o fr.
        //file reader serve para ler o arquivo, e o buffered reader para otimizar esse processo de leitura
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
