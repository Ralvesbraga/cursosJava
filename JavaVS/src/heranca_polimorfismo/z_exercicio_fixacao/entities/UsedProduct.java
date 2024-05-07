package heranca_polimorfismo.z_exercicio_fixacao.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct() {
        
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " $" + getPrice()
                + " (Manufacture date: " + sdf.format(manufactureDate) +")";
    }    
}
