package javaoop.lesson4.excecoes;

public class Classe2 {

    public void metod2() throws NullPointerException, ArithmeticException{
        System.out.println("executando o método 2");

        int valor = 10/1;
        System.out.println("o valor da divisão é: " + valor);

        Classe3 obj3 = new Classe3();
        obj3.metod3();
        System.out.println("finalizando o método 2");
    }
}
