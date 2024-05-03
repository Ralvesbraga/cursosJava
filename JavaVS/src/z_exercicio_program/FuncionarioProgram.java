package z_exercicio_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import z_exercicio_OO.Funcionario;

public class FuncionarioProgram {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List <Funcionario> func = new ArrayList<>();
        
        System.out.print("Enter with employees number: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();
            Funcionario employee = new Funcionario(name, id, salary);
            func.add(employee);
        }


        System.out.print("ENter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Funcionario emp = func.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id does not exist!");
        } else{
        System.out.print("Enter the percentage: ");
        int percent = sc.nextInt();
        emp.salaryIncrease(percent);
        }

        System.out.println();
        for (Funcionario funcio : func){
            System.out.println(funcio);
        }

        
        sc.close();
    }
}
