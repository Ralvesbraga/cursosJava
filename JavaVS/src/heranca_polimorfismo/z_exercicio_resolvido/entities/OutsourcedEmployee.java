package heranca_polimorfismo.z_exercicio_resolvido.entities;

public class OutsourcedEmployee extends Employee {
    
    private Double additionalCharge;


    

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee() {
        
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return (this.hours * this.valuePerHour) + 1.1*this.additionalCharge;
    }    
    
}
