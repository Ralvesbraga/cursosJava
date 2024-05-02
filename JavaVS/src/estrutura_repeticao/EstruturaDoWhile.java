package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        
        /*
         * Sintaxe do while

         do{
            comando1
            comando2
         } while (condição); // V: volta
                                F: pula fora
         */
        Locale.setDefault(Locale.US);

         Scanner sc = new Scanner(System.in);
         char resposta = 's';

         
         do{
            System.out.println("Ente com a temperatura em Celsius: ");
            double temperaturaC = sc.nextDouble();
            double temperaturaF = (9*temperaturaC)/5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.2f\n", temperaturaF);
            System.out.println("Deseja repetir (s/n)?");
            resposta = sc.next().charAt(0);
            
         } while(resposta != 'n');

         sc.close();

    }
}
