package z_exercicio_OO;

public class Funcionario {

    private String name;
    private Integer id;
    private Double salary;


    public Funcionario(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }


    public Double getSalary() {
        return salary;
    }

    public void salaryIncrease(int per){
        this.salary *= (1+per/100);
    }

    public String toString(){
        return 
        "Name: " + this.getName() + 
        ", Id: " + this.getId() +  
        ", Salary: " + String.format("%.2f ", this.getSalary());
    }
    
}
