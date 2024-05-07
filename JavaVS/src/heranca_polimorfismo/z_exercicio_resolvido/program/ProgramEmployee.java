package heranca_polimorfismo.z_exercicio_resolvido.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import heranca_polimorfismo.z_exercicio_resolvido.entities.Employee;
import heranca_polimorfismo.z_exercicio_resolvido.entities.OutsourcedEmployee;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Employee> emps = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.print("Ousourced (y/n)? ");
            char res = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            if(res == 'y'){
                System.out.print("Additional charge: ");
                double add = sc.nextDouble();
                Employee out = new OutsourcedEmployee(name,hours,value,add);
                emps.add(out);
            } else{
                Employee emp = new Employee(name, hours, value);
                emps.add(emp);
            }
        }

        for(Employee emp : emps){
            System.out.println(emp);
        }


        sc.close();
    }
}
