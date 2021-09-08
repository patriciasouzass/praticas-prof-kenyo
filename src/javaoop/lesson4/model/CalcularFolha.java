package javaoop.lesson4.model;

public class CalcularFolha {

    public double calcula(Funcionario[] funcionarios){

        double totalPagar = 0;
        for (int i=0; i<funcionarios.length; i++){
            totalPagar = totalPagar + funcionarios[i].getSalario();
        }

        return totalPagar;
    }
}
