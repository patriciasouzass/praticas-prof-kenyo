package javaoop;

import javaoop.model.*;

public class ProgramaFolhaPagamento {

    public static void main(String[] args){

        Funcionario f1 = new Funcionario("Kenyo", "M", 3000);
        Funcionario f2 = new Funcionario("Patricia", "F", 5800);
        Gerente g1 = new Gerente("Marcela", "F", 8900);
        Vendedor v1 = new Vendedor("Cleiton", "M", 2300, 1000);
        Desenvolvedor dev = new Desenvolvedor("Patricia", "F", 17000, "patricia@gmail.com", "12345");

        Funcionario[] array = {f1, f2, g1, v1, dev};

        CalcularFolha folha = new CalcularFolha();
        double total = folha.calcula(array);

        System.out.println("Total da folha de pagamento: " + total);
    }
}
