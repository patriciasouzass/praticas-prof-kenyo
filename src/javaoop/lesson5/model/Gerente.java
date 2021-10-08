package javaoop.lesson5.model;

import java.text.ParseException;

public class Gerente extends Funcionario {

    public Gerente(String nome, String sexo, double salario, String cpf) throws ParseException {
        super(nome, sexo, salario, cpf);
    }

    public double getGratificacao(){
        return super.getSalario() * 0.05;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + getGratificacao();
    }

    @Override
    public String toString() {
        return super.toString() + "      " + getGratificacao();
    }
}
