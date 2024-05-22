package generics_set_map.exemplo2_generics.services;

import java.util.List;

public class CalculationService {
    //Esse método vai trabalhar com qualquer tipo T(ex: list<T>), desde que esse T seja qualquer subtipo de Comparable<T> 
    public static <T extends Comparable<T>> T max(List<T> list){
        if(list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for(T item : list){
            if (item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
    
}
