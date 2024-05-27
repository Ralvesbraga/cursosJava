package programacao_funcional_expressoes_lambdas.consumer.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import programacao_funcional_expressoes_lambdas.consumer.util.PriceUpdate;
import programacao_funcional_expressoes_lambdas.consumer.entities.Product;


public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Mouse", 50.00));

        double factor = 1.1;
        
        list.forEach(p -> p.setPrice(p.getPrice() * factor));


        list.forEach(System.out::println);


    }
}
