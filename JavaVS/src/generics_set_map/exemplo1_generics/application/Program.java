package generics_set_map.exemplo1_generics.application;

import java.util.Scanner;

import generics_set_map.exemplo1_generics.services.PrintService;

public class Program {
    
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();
    
        System.out.print("How many values? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);
        sc.close();
    }
}
