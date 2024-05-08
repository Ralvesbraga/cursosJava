package z_exercicio_abstrato_fixacao.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import z_exercicio_abstrato_fixacao.entities.Pessoa;
import z_exercicio_abstrato_fixacao.entities.PessoaFisica;
import z_exercicio_abstrato_fixacao.entities.PessoaJuridica;

public class ProgramPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <Pessoa> persons = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
  

        for(int i = 0; i < n; i++){
            System.out.printf("Tax payer #%d data:\n", i+1);
            System.out.print("Individual or company (i/c)? ");
            char res = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anual_income = sc.nextDouble();
            if(res == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                Pessoa person = new PessoaFisica(name, anual_income, health);
                persons.add(person);
            } else{
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                Pessoa person = new PessoaJuridica(name, anual_income, employees);
                persons.add(person);
            }
        }

        System.out.println("Taxes Paid:");
        for (Pessoa p: persons){
            System.out.println(p);
        }

        sc.close();
    }
}
