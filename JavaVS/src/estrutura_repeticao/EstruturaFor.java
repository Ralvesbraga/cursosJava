package estrutura_repeticao;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {

        /*
         * Sintaxe do FOR:
           executa | V: Executa | Executa 
           somente |    e volta.| toda vez
           na prim | F: pula    | depois de
           eira vez|    fora.   | voltar.
         for(inicio ; condição ; incremento){
            comando1;
            comando2;

         }
         */
        Scanner sc = new Scanner(System.in);

         int n = sc.nextInt();
         int soma = 0;

         for(int i = 0; i<n; i++){
            soma += sc.nextInt();
         }
         System.out.println(soma);
        sc.close();
    }
}
