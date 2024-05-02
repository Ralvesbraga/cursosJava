package vetores_listas;

public class LacoForEach {
    public static void main(String[] args) {
        /*
         * Laço for each é uma sintaxe opcional e simplificada para percorrer coleções
         * sintaxe:

        for (Tipo apelido : coleção){
            <comando1>
            <comando2>
        }
         */

         String[] vect = new String[] {"Maria", "Bob", "Alex"};
         
         for(int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
         }
         System.out.println("---------------------------------");
         //Percorre todos os elementos de vect, chamando cada um dos elementos de nome.
         for(String nome : vect){
            System.out.println(nome);
         }
    }
}
