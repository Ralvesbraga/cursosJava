package introducaoOrientacaoObjetos.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock(){
        return this.price * this.quantity;
        
    }

    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return this.name + ", $ "
            + String.format("%.2f", this.price) + ", "
            + this.quantity + " units, "
            + "Total: $" + String.format("%.2f", this.TotalValueInStock()); 
    }
}
