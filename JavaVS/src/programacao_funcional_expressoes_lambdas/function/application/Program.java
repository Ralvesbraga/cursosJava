package programacao_funcional_expressoes_lambdas.function.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import programacao_funcional_expressoes_lambdas.function.entities.Product;



public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD case", 80.90));
        list.add(new Product("Mouse", 50.00));


        // Função map: é uma função que aplica uma função a todos os elementos de uma stream(Sequencia de dados)
        //Conversões: List para Stream: .stream()
        //Stream para List: .collect(Collectors.toList())

        //Transforma toda a lista em stream, usa o map para usar a função em toda a stream, depois converte a stream para list e armazena em uma lista de Strings
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);


        


    }
}
