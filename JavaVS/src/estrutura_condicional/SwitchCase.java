package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        /*
            if(x == 1){
                dia  = "domingo";
            } else if (x == 2){
                dia = "segunda";
            } else if(x == 3){
                dia = "terça";
            } else if (x == 4){
                dia = "quarta"
            } ...

            estrutura do switch-case:

            switch(expressão){
                case valor1:
                    comando1
                    comando2
                    break;
                case valor2:
                    comando3
                    comando4
                    break;
                default:
                    comando5;
                    comando6;
                    break;                    
            }

            essa estrutura acima, usando switch case, fica:
         */

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();


                
    }
}
