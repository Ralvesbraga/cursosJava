package generics_set_map.exercicio_resolvido_set.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import generics_set_map.exercicio_resolvido_set.entities.LogEntry;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.next();      

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();
            String line = br.readLine(); // lê uma linha e armazena na string line

            while(line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment));

                line = br.readLine();
            }

            set.addAll(set);
            
            System.out.println("Total users: " + set.size());
        
            
        } catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
            sc.close();
        }
    }
}
