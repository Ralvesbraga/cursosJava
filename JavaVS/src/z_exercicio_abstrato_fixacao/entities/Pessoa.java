package z_exercicio_abstrato_fixacao.entities;

public abstract class Pessoa {
    private String nome;
    protected Double rendaAnual;

    
    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getRendaAnual() {
        return rendaAnual;
    }
    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public String toString(){
        return getNome() + ": $" 
        + String.format("%.2f", valorImposto());
    }

    public abstract  double valorImposto();

}
