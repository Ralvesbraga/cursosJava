package generics_set_map;

public class TipoMap {
    /*
     * É uma coleção de pares chave/valor
     * não admite repetições do objeto chave
     * os elementos são indexados pelo objeto chave (não possuem posição)
     * Acesso, inserção e remoção de elementoss são rápidos
     * 
     * Uso comum: cookies, local storage, qualquer modelo chave-valor
     * 
     * Principais implementações:
     * HasMap - mais rápido e não ordenado
     * TreeMap - mais lento e ordenado pelo compareTo do objeto
     * LinkedHashMap - velocidade intermediária e elementos na ordem em que são adicionados
     * 
     * Alguns métodos importantes:
     * put(key, value), remove(key), containsKey(key), get(key)
     * Baseado em equals e hashCode
     * Se equals e hashCode não existir, é usada comparação de ponteiros
     * 
     * clear()
     * size()
     * 
     * keySet() - retorna um set<K>
     * values() - retorna um Collection<V>
     */
}
