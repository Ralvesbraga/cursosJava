package z_exercicio_abstrato_fixacao.entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude = 0.0;

    
    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica() {
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double valorImposto() {
        if(this.getRendaAnual() < 20000.00){
            return (getRendaAnual() * 0.15) - getGastosSaude() * 0.5;
        }
        return getRendaAnual() * 0.25 - getGastosSaude() * 0.5;
    }
}
