package z_exercicio_composicao_fixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import z_exercicio_composicao_fixacao.enums.OrderStatus;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    

    private Date moment;
    private OrderStatus status;
    private List<OrderItem> itens = new ArrayList<>();


    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }


    public Date getMoment() {
        return moment;
    }


    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public OrderStatus getStatus() {
        return status;
    }


    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        this.itens.add(item);
    }

    public void removeItem(OrderItem item){
        this.itens.remove(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem item : itens){
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append()


    }
    
}
