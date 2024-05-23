package generics_set_map.exercicio_fixacao_map.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter file full path: ");
        String path = sc.next();

        Map<String, Integer> election = new LinkedHashMap<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                if(election.containsKey(fields[0])){
                    Integer num = election.get(fields[0]);
                    num += Integer.parseInt(fields[1]);
                    election.put(fields[0], num);
                } else{
                    election.put(fields[0], Integer.parseInt(fields[1]));
                }

                line = br.readLine();
            }

            for(String key : election.keySet()){
                System.out.println(key + ": " + election.get(key));
            }


        }catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
