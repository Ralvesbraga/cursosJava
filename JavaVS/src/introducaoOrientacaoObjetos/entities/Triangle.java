package introducaoOrientacaoObjetos.entities;

public class Triangle {
    
    public double a;
    public double b;
    public double c;

    /*O prefixo public indica que o atributo ou método
     * pode ser usado em outros arquivos;
     */
    public double area(){
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

}
