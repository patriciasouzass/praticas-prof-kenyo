package javaoop.lesson4.excecoes;

import javaoop.lesson4.model.Funcionario;

public class Classe3 {

    private Funcionario funcionario;

    public void metod3() throws NullPointerException{
        System.out.println("executando o método 3");

        System.out.println("salário do diretor: " + funcionario.getSalario());

        System.out.println("finalizando o método 3");
    }
}
