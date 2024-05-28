package programacao_funcional_expressoes_lambdas.stream.exercicio_resolvido.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import programacao_funcional_expressoes_lambdas.stream.exercicio_resolvido.entities.Product;


public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        
        System.out.print("Enter full file path:");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                Product product = new Product(fields[0], Double.parseDouble(fields[1]));
                products.add(product);
                line = br.readLine();
            }
            //Pega a lista de produtos, usa o map para cada produto p,  pegar o valor dele, e somar com o reduce, apos isso dividir pelo tamanho da lista
            Double avg = products.stream().map(p -> p.getprice()).reduce(0.0, (x,y) -> x+y) / products.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            //Transforma a lista para stream,filtra pelos produtos que contém o preço menor que a média, depois usando o map, pega o nome desses produtos e ordena com sorted, alocando 
            //um comparator.reversed(), depois transforma tudo para lista
            List<String> names = products.stream().filter(p -> p.getprice() < avg).map(p -> p.getName()).sorted(comp.reversed()).collect(Collectors.toList());
            
            names.forEach(System.out::println);

        } catch (IOException e ) {
            System.out.println("ERROR: " + e.getMessage());
        }
        sc.close();
    }
}
