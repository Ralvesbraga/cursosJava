package z_exercicio_OO;

public class Conta {
    
    private int num_conta;
    private String name;
    private double value;

    public Conta(int num_conta, String name, double value){
        this.num_conta = num_conta;
        this.name = name;
        this.value = value;
    }


    public int getNum_conta() {
        return num_conta;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getValue() {
        return value;
    }
    public void deposito(double value) {
        this.value += value;
    }

    public void saque(double value){
        this.value -= value - 5.00;
    }
    

    public String toString(){
        return "Holder: " + this.getName()
                + ", Balance: $ " + String.format("%.2f ", this.getValue())
                + ", Account Number: " + this.num_conta
                + "\n";
    }


    
    

}
