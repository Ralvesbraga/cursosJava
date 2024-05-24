package programacao_funcional_expressoes_lambdas.predicate.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import programacao_funcional_expressoes_lambdas.predicate.entities.Product;


public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Mouse", 50.00));

        double min = 100.00;

        list.removeIf(p -> p.getPrice() >= min);  

        for(Product p : list){
            System.out.println(p);
        }
    }
}
