package introducaoOrientacaoObjetos.conceitos;

import java.util.Locale;
import java.util.Scanner;


public class Construtores {
    public static void main(String[] args) {
        /*
         * É uma operação especial da classe, que executa no momento da instanciação do objeto

         * Usos comuns:
         *  Iniciar valores dos atributos;
         *  Permitir ou obrigar que o objeto receba dados / dependências no momento de sua 
         *  instanciação (injeção de dependencia);

         * Se um construto customizado não for especificado, a classe disponibiliza o construtor 
         * padrão:  Product p = new Product();

         * É possível especificar mais de um construtor na mesma classe(sobrecarga)
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " );
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        sc.close();

    }

    public static class Product {

        public String name;
        public double price;
        public int quantity;

        public Product(String name, double price, int quantity){ // A palavra this é uma referência para o próprio objeto.
            this.name = name;                                    // Serve para diferenciar atributos de variáveis locais
            this.price = price;                                  // Passar o próprio objeto como argumento na chamada de um método ou construtor
            this.quantity = quantity;
        }

        public double totalValueInStock() {
        return price * quantity;
        }
        public void addProducts(int quantity) {
        this.quantity += quantity;
        }
        public void removeProducts(int quantity) {
        this.quantity -= quantity;
        }
        public String toString() {
        return name
        + ", $ "
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
        }
    }
}
