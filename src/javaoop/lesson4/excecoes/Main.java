package javaoop.lesson4.excecoes;

import javaoop.lesson4.model.Funcionario;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Funcionario f1 = new Funcionario("Kenyo", "M", 3000);

        Classe1 obj1 = new Classe1();

        try {
            obj1.metod1();
            System.out.println("programa finalizado");
        } catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
