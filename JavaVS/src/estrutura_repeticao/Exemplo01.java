package estrutura_repeticao;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        
        int senha = 2002;
        Scanner sc = new Scanner(System.in);

        int senha_digitada = sc.nextInt();

        while (senha_digitada != senha) {
            System.out.println("Senha Invalida");
            senha_digitada = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
