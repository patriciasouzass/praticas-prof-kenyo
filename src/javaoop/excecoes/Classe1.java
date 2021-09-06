package javaoop.excecoes;

public class Classe1 {

    public void metod1() throws NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException{
        System.out.println("executando o método 1");

        String[] array = {"P", "A", "T", "I"};
        for (int i=0; i<=array.length; i++){
            System.out.println("método 1: " + array[i]);
        }

        Classe2 obj2 = new Classe2();
        obj2.metod2();

        System.out.println("finalizando método 1");
    }
}
