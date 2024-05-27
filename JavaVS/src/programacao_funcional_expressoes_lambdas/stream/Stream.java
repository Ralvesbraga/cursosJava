package programacao_funcional_expressoes_lambdas.stream;

public class Stream {
    
    /*
     * Stream é uma solução para processar sequências de dados de forma:
     * Declarativa (iteração interna: escondida do programador)
     * Parallel-friendly (imutável -> thread safe)
     * Sem efeitos colaterais
     * Sob demanda (lazy evaluation)
     * 
     * Acesso sequêncial (não há indices)
     * 
     * Single-use: só pode ser "usada" uma vez
     * 
     * Pipeline: operações em streams retornam novas streams. ENtão é possível criar uma cadeia
     * de operações (fluxo de processamento).
     * 
     * Operações intermediárias e terminais
     * 
     * o pipeline é composto por zero ou mais operações intermediárias e uma terminal
     * 
     * Operação intermediária:
     * produz uma nova streams (encadeamento)
     * só executa quando uma operação terminal é invocada (lazy evaluation)
     * filter, map, flatmap, peek, distinct, sorted, skip, limit
     * 
     * Operação terminal:
     * Produz um objeto não-stream (coleção ou outro)
     * determina o fim do processamento da stream
     * forEach, forEachOrdered, toArray, reduce, etc
     */
}
