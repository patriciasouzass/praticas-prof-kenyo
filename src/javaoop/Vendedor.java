package javaoop;

public class Vendedor extends Funcionario{

    private double faturamento;

    public Vendedor(String n, String s, double sal, double f){
        super (n, s, sal);
        faturamento = f;
    }

    public double getComissao(){
        return faturamento * 0.05;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + getComissao();
    }

    @Override
    public String toString() {
        return super.toString() + "      " + getComissao() + "      " + getSalario();
    }
}
