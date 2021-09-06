package javaoop.excecoes;

import javaoop.model.Funcionario;

public class Classe3 {

    private Funcionario funcionario;

    public void metod3() throws NullPointerException{
        System.out.println("executando o método 3");

        System.out.println("salário do direto: " + funcionario.getSalario());

        System.out.println("finalizando o método 3");
    }
}
