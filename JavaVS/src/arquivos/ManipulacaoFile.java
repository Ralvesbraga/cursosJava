package arquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulacaoFile {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);
        //Filtrando diretórios
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder);
        }
        System.out.println();
        //Filtrando arquivos 
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file: files){
            System.out.println(file);
        }

        System.out.println();

        //Criando diretorios
        boolean success = new File(strPath + "\\novo_diretorio").mkdir();
        System.out.println("Directory created succesfully: " + success);

        sc.close();
    }
}
