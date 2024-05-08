package z_exercicio_abstrato_fixacao.entities;

public class PessoaJuridica extends Pessoa{
    
    private Integer numFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public PessoaJuridica() {
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double valorImposto() {
        if(getNumFuncionarios() < 10){
            return getRendaAnual() * 0.16;
        }
        return getRendaAnual() * 0.14;
    }

    

    
}
