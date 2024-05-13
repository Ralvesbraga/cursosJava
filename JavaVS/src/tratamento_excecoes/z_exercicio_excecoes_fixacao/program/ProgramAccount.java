package tratamento_excecoes.z_exercicio_excecoes_fixacao.program;

import java.util.Locale;
import java.util.Scanner;

import tratamento_excecoes.z_exercicio_excecoes_fixacao.model.entities.Account;
import tratamento_excecoes.z_exercicio_excecoes_fixacao.model.exceptions.WithdrawException;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String name = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limit = sc.nextDouble();
        Account acc = new Account(number, name, balance, limit);
        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        acc.withdraw(sc.nextDouble());
        } catch(WithdrawException e ){
            System.out.println("Error on withdraw: " + e.getMessage());
        } catch(RuntimeException e){
            System.out.println("Unexpected error");
        }
        sc.close();
    }
}
