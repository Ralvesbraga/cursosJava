package introducaoOrientacaoObjetos.conceitos;

import java.util.Locale;
import java.util.Scanner;

public class Encapsulamento {
    public static void main(String[] args) {
        /*
         * Sobrecarga é um recurso que uma classe possui de 
         * oferecer mais de uma operação com o mesmo nome, porém com 
         * diferentes listas de parâmetros.
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " );
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        product.setName("Computer");
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();

    }

    public static class Product {

        private String name;
        private double price;
        private int quantity;

        public Product(){
            
        }

        public Product(String name, double price){  
            this.name = name;                                    
            this.price = price;                                   

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
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
