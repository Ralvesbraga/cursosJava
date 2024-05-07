package heranca_polimorfismo.z_exemplos_abordados.entities;

public abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance;


    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(){

    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withDraw(double amount){
        this.balance -= amount + 5.0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    
    
    
    
}
