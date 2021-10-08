package javaoop.lesson5;

import javaoop.lesson5.model.Cliente;
import javaoop.lesson5.model.Desenvolvedor;
import javaoop.lesson5.util.ArquivoUtil;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        Desenvolvedor dev1 = new Desenvolvedor("Patricia", "F", 60000, "patricia", "12345", "15624115716");
        Cliente c1 = new Cliente("João", "1234");

        ArquivoUtil arquivoUtil = new ArquivoUtil();
        arquivoUtil.escreveObjetoArquivoTexto(dev1);
        arquivoUtil.fechaArquivo();

        dev1.autentica("patricia", "12345");
        c1.autentica("João", "1234");

        System.out.println(dev1);
    }
}
