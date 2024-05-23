package generics_set_map.exercicio_fixacao_set.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> ca = new HashSet<>();
        Set<Integer> cb = new HashSet<>();
        Set<Integer> cc = new HashSet<>();
        Set<Integer> total = new HashSet<>();

        System.out.print("How many students for course A?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            ca.add(sc.nextInt());
        }

        System.out.print("How many students for course B?");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            cb.add(sc.nextInt());
        }

        System.out.print("How many students for course C?");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            cc.add(sc.nextInt());
        }

        total.addAll(ca);
        total.addAll(cb);
        total.addAll(cc);

        System.out.println("Total students: " + total.size());

        sc.close();

    }
}
