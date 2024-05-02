package resolucao_exercicio_program;

import java.util.Locale;
import java.util.Scanner;

import resolucao_exercicio_OO.Conta;

public class ContaProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num_conta;
        String name;
        double value = 0;
        char response;

        System.out.print("Enter  account number: ");
        num_conta = sc.nextInt();
        
        System.out.print("Enter  holder name: ");
        name = sc.next();


        System.out.print("do you want make a initial deposit (y/n)? ");
        response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter  desired value: ");
            value = sc.nextDouble();
        } else{
            System.out.println("Thank you for your preference");
        }

        Conta conta01 = new Conta(num_conta, name, value);

        System.out.println("Account data: " + conta01);

        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        System.out.println("Account data: " + conta01);

        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        System.out.println("Account data: " + conta01);

        sc.close();
    }
}
