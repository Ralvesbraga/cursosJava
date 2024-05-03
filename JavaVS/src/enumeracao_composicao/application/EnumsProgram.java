package enumeracao_composicao.application;

import java.util.Date;

import enumeracao_composicao.entities.Order;
import enumeracao_composicao.enums.OrderStatus;

public class EnumsProgram {

    public static void main(String[] args) {
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        /*Converter de Strin para enum*/

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
    
}
