package arquivos.exercicio_proposto.program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import arquivos.exercicio_proposto.entities.Product;

public class ProgramArquivos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter with file path: ");
        String path = sc.nextLine();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<String> lines = new ArrayList<>();


        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] parts = line.split(",");
                Product product = new Product(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));
                products.add(product);
                line = br.readLine();
            }
        } catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        for(Product p : products){
            System.out.println(p);
        }
    }
}
