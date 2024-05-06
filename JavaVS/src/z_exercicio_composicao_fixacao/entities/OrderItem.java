package z_exercicio_composicao_fixacao.entities;

public class OrderItem {
    
    private Integer quantity;
    private Double price;

    private Product prouct;

    public OrderItem(Integer quantity, Double price, Product prouct) {
        this.quantity = quantity;
        this.price = price;
        this.prouct = prouct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProuct() {
        return prouct;
    }

    public void setProuct(Product prouct) {
        this.prouct = prouct;
    }

    public double subTotal(){
        return this.price * this.quantity;
    }

    public String toString(){
        return getProuct().getName()
                + ", $ "
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
