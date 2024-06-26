package programacao_funcional_expressoes_lambdas.funcoes_anonimas.application;

import java.util.ArrayList;
import java.util.List;

import programacao_funcional_expressoes_lambdas.funcoes_anonimas.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


        list.sort((o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase())); // Reduzindo ainda mais para uma linha, agora fazendo a função diretamente na lista
          

        for(Product p : list){
            System.out.println(p);
        }
    }
}
