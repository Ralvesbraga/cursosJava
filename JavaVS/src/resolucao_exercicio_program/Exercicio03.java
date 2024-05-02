package resolucao_exercicio_program;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A,B,C,D;
        
        A= sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        D= sc.nextInt();

        double DIFERENCA = (A*B-C*D);

        System.out.printf("DIFERENCA = %.0f", DIFERENCA); 

        sc.close();

    }
}
