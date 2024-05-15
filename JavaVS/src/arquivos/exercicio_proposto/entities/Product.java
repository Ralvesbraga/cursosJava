package arquivos.exercicio_proposto.entities;

public class Product {
    private String name;
    private Double preco;
    private Integer quantity;

    
    public Product(String name, Double preco, Integer quantity) {
        this.name = name;
        this.preco = preco;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Double getPreco() {
        return preco;
    }


    public void setPreco(Double preco) {
        this.preco = preco;
    }


    public Integer getQuantity() {
        return quantity;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double totalValue(){
        return getPreco() * getQuantity();
    }

    public String toString(){
        return getName() +
                String.format(", %.2f", totalValue());
    }
    
}
