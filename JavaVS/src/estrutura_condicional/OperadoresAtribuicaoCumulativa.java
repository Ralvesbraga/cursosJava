package estrutura_condicional;

import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos minutos foi utilizado? ");
        int minutos = sc.nextInt();

        if(minutos <= 100){
            System.out.println("Valor a pagar: R$ 50.00");
        }
        else{
            int extra = (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$ %d.00\n", extra + 50);
        }
        
        sc.close();

        /*
         * Operadores de atribuição cumulativa:
         * a += b;      a = a + b;
         * a -= b;      a = a - b;
         * a *= b;      a = a * b;
         * a /= b;      a = a / b;
         * a %= b;      a = a % b;
         */
    }
}
