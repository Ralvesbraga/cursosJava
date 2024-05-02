package estrutura_repeticao;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        
        /*
         * Sintaxe while:

         while(condição){   // Verdadeiro -> executa e volta // Falso -> pula fora.
            comando1;
            comando2;
         }
         */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while(x!=0){
            soma += x;
            x = sc.nextInt();

        }
        System.out.printf("O somatório foi: %d", soma);
        sc.close();
    }
}
