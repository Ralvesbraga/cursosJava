package z_exercicio_program;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double raio = sc.nextDouble();

        System.out.printf("A=%.4f", pi*(raio*raio));

        sc.close();

    }
}
