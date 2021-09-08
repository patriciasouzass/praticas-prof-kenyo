package javaoop.lesson4.model;

import javaoop.lesson4.model.Funcionario;

public class Vendedor extends Funcionario {

    private double faturamento;

    public Vendedor(String nome, String sexo, double salario, double faturamento){
        super (nome, sexo, salario);
        this.faturamento = faturamento;
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