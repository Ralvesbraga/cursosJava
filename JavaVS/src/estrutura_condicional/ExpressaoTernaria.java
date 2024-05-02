package estrutura_condicional;

public class ExpressaoTernaria {
    
    public static void main(String[] args) {
        /*
         * Estrutura opcional ao if-else quando se deseja decidir um VALOR  com base em uma condição.
         
            Sintaxe:
            (condição) ? valor_se_verdadeiro : valor_se_falso

            ex:

         */

        double preco = 34.5;
        double desconto;

        if(preco < 20.0){
            desconto = preco * 0.1;
        }
        else{
            desconto = preco * 0.05;
        }

        System.out.printf("desconto = %.2f\n", desconto);

        desconto = (preco < 20) ? preco * 0.2 : preco * 0.15;

        System.out.printf("desconto = %.2f\n", desconto);

        
    }
}
