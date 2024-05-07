package heranca_polimorfismo.z_exercicio_fixacao.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $" + String.format("%.2f", getPrice() + getCustomsFee())
                + "(Customs fee: " + String.format("%.2f", getCustomsFee());
    } 

    


    
}
