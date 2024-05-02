package vetores_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista02 {
    public static void main(String[] args) {
        /*
         * Tamanho da lista: size()
         * Inserir elemento na lista: add(obj), add(int, obj)
         * Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
         * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
         * Filtrar lista com base em predicado: List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
         * Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
         */

        //O tipo lista só aceita as wrapper classes.
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size());


        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("---------1-----------");
        
        list.remove("Anna");
        list.remove(1);
        
        for (String nome : list){
            System.out.println(nome);
        }
        
        System.out.println("--------3------------");
        
        list.add("Um nome");

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("--------4------------");


        list.add("Um nome");
        list.add("Um nome3");
        list.add("Um nome2");

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("--------4------------");

        //Pega um valor x e me retorna somente se esse x é igual a U     
        list.removeIf(x -> x.charAt(0) == 'U');

        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("--------5------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Anna"));
        System.out.println("--------6------------");
        //Precisa instanciar uma outra lista do tipo string para rececber os filtros da lista filtrada.
        //list.stream() permite fazer operações com lambdas, convertendo-o pra stream
        //filter para pegar o valor da string que começa com o B
        //collect serve para transformar de stream para lista novamente
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());

        for (String nome : result){
            System.out.println(nome);
        }

        System.out.println("--------7------------");
        // A função find first pega o primeiro elemento da stream que atender a condição do filtro, se o elemento não existir, ele devolve nulo 
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);



    }
}
