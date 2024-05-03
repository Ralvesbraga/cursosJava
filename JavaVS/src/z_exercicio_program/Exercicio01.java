package z_exercicio_program;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("SOMA = %d\n", a+b);

        sc.close();
    }
}
