package z_exercicio_composicao_fixacao.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


import z_exercicio_composicao_fixacao.entities.Client;
import z_exercicio_composicao_fixacao.entities.Order;
import z_exercicio_composicao_fixacao.entities.OrderItem;
import z_exercicio_composicao_fixacao.entities.Product;
import z_exercicio_composicao_fixacao.enums.OrderStatus;


public class ProgramOrder {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        //Converte a string para o valor esperado de OrderStatus:
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name:");
            sc.nextLine();
            String pName = sc.nextLine();
            System.out.print("Product price: ");
            double p_price = sc.nextDouble();
            System.out.print("Quantity: ");
            int p_quantity = sc.nextInt();

            Product product = new Product(pName, p_price);

            OrderItem it = new OrderItem(p_quantity, p_price, product);

            order.addItem(it);             
        }

        System.out.println();
        System.out.println(order);
         



        sc.close();
    }
}
