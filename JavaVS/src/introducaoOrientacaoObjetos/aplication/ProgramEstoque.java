package introducaoOrientacaoObjetos.aplication;

import java.util.Locale;
import java.util.Scanner;

import introducaoOrientacaoObjetos.entities.Product;

public class ProgramEstoque {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        
        System.out.println("Product data: " + product);

        System.out.print("Enter the number of products to be from stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println("Update data: " + product);


        sc.close();
        
    }
}
