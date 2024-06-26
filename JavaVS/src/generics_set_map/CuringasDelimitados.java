package generics_set_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuringasDelimitados {
    
     public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    //lista de origem é um exemplo de covariancia e lista de destino é uma lista de contravariancia
    //covariancia: aceita qualquer subtipo para acessar, mas não para adicionar
    //contravariancia: aceita qualquer tipo para adicionar, mas não para acessar
    
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
        destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
        System.out.print(obj + " ");
        }
    System.out.println();
    }
}
