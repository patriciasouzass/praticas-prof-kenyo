package javaoop;

import javaoop.model.*;

public class ProgramaAutenticacao {

    public static void main (String[] args){

        Desenvolvedor dev = new Desenvolvedor("Patricia", "F", 17000, "patricia@gmail.com", "12345");
        Cliente cliente = new Cliente("cliente@gmail.com", "2222");

        boolean autenticacaoDev = dev.autentica("patricia@gmail.com", "12345");
        boolean autenticacaoCliente = cliente.autentica("cliente@gmail.com", "2222");

        System.out.println("Autenticação Dev: " + autenticacaoDev);
        System.out.println("Autenticação Cliente: " + autenticacaoCliente);

    }
}
