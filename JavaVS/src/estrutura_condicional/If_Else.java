package estrutura_condicional;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        //Sintaxe da estrutura condicional:
        //Simples:

        /*
            if(condição){
                comando 1;
                comando 2;
            }

            int x = 5;

        System.out.println("BOM DIA");

        if (x < 0){
            System.out.println("BOA TARDE");
        }

        System.out.println("BOA NOITE");
         */

        
        /*
            Sintaxe Composta:

            if(condição){
                comando 1;
                comando 2;
            }
            else {
                comando 3;
                comando 4;
            }

            Encadeamento de estruturas condicionais:

            if(condição){
                comando 1;
                comando 2;
            }
            else {
                if(condição 2){
                    comando 3
                    comando 4
                } 
                else{
                    comando 5
                    comando 6
                }
            }

         */
        
        int hora;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        if(hora<12){
            System.out.println("Bom dia");
        } 
        else{
            if(hora>=12 && hora<=18){
                System.out.println("Boa tarde");
            } 
            else{
                System.out.println("Boa Noite");

            }
        }


        sc.close();
    
    }
}
