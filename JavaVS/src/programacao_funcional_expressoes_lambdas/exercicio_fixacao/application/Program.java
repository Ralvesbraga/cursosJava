package programacao_funcional_expressoes_lambdas.exercicio_fixacao.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import programacao_funcional_expressoes_lambdas.exercicio_fixacao.entities.Employee;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


        System.out.print("Enter full file path: ");
        String path = sc.next();
        System.out.print("Enter salary:");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                Employee emp = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
                list.add(emp);
                line = br.readLine();
            }

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted(comp).collect(Collectors.toList());
            System.out.println("\nEmail of people whose salary is more than 2000.00:");
            names.forEach(System.out::println);

            Double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

            
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
