package topicos_basicos_java;

public class FuncoesString {
    public static void main(String[] args) {
        /*
         * Formatar: toLowerCase();, toUpperCase();, trim(); transformar para minusculo, maiuscula e retirar os espaços.
         * Recortar: substring(inicio);, substring(inicio, fim); recorta a string com base no indice
         * Buscar: IndexOf, LastIndexOf
         * str.Split(" ");
         */

        String original = " abcde FGHIJ ABC abc DEFG         ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(3);
        String s05 = original.substring(3, 10);
        String s06 = original.replace('a', 'x');
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(3): -" + s04 + "-");
        System.out.println("substring(3, 10): -" + s05 + "-");
        System.out.println("replace(a, x): -" + s06 + "-");
        System.out.println("indexOf(bc):" + i);
        System.out.println("lastIndexOf(bc):" + j);

        /*
         * Operação Split:
         */

        String s = "potato apple lemon";

        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("---------------------------");
        System.out.println(s);
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }
}
