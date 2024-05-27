package programacao_funcional_expressoes_lambdas.funcoes_proprias.application;

import java.util.ArrayList;
import java.util.List;


import programacao_funcional_expressoes_lambdas.funcoes_proprias.entities.Product;
import programacao_funcional_expressoes_lambdas.funcoes_proprias.service.ProductService;



public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Mouse", 50.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getPrice() < 100.00);

        System.out.println("Sum = " + String.format("%.2f", sum));




        


    }
}
