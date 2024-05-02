package introducaoOrientacaoObjetos.conceitos;

public class BoxingUmboxingWrapper {
    public static void main(String[] args) {
        int x = 20;

        //Boxing: É o processo de conversão de um objeto tipo valor para um objeto tipo referência compátivel.
        Object obj = x;
        System.out.println(obj);

        //Unboxing: É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
        int y = (int) obj;

        System.out.println(y);

        /*
         * Wrapper classes:
         * São classes equivalentes aos tipos primitivos
         * Boxing e Unboxing é natural na linguagem
         * Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
         *  Pois tipos referências (classes) aceitam valor null e usufruem dos recursos OO
         */

        //Com a wrapper class Integer, semelhante ao int. Não é necessário fazer o casting
        Integer obj02 = x;
        System.out.println(obj02);

        y = obj02;
        System.out.println(y);

    }
}
