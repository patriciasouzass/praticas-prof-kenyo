package javaoop.lesson5.model;

import java.text.ParseException;

public class Vendedor extends Funcionario {

    private double faturamento;

    public Vendedor(String nome, String sexo, double salario, double faturamento, String cpf) throws ParseException {
        super (nome, sexo, salario, cpf);
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
