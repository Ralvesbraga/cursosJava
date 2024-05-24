package programacao_funcional_expressoes_lambdas.predicate.application;

import java.util.ArrayList;
import java.util.List;

import programacao_funcional_expressoes_lambdas.predicate.entities.Product;
import programacao_funcional_expressoes_lambdas.predicate.util.ProductPredicate;

public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Mouse", 50.00));

        list.removeIf(new ProductPredicate()); //remove qualquer produto da lista que tenha o preço superior a 100 

        for(Product p : list){
            System.out.println(p);
        }
    }
}
