package generics_set_map.exercicio_resolvido_set.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();
        Set<String> set = new LinkedHashSet<>();
        

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine(); // lê uma linha e armazena na string line

            while(line != null){
                String[] fields = line.split(" ");
                set.add(fields[0]);
                line = br.readLine();
            }

            set.addAll(set);
            
            System.out.println("Total users: " + set.size());
        
            
        } catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
