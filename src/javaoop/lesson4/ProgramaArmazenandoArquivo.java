package javaoop.lesson4;

import javaoop.lesson4.model.Desenvolvedor;
import javaoop.lesson4.model.Funcionario;
import javaoop.lesson4.model.Gerente;
import javaoop.lesson4.model.Vendedor;
import javaoop.lesson4.util.ArquivoUtil;

import java.io.IOException;

public class ProgramaArmazenandoArquivo {

    public static void main(String[] args) throws IOException{
        Funcionario f1 = new Funcionario("Kenyo", "M", 3000);
        Funcionario f2 = new Funcionario("Patricia", "F", 5800);
        Funcionario g1 = new Gerente("Marcela", "F", 8900);
        Funcionario v1 = new Vendedor("Cleiton", "M", 2300, 1000);
        Funcionario dev = new Desenvolvedor("Patricia", "F", 17000, "patricia@gmail.com", "12345");

        ArquivoUtil arquivoUtil = new ArquivoUtil();

        Funcionario[] funcionarios = {f1, f2, g1, v1, dev};

        arquivoUtil.escreveObjetoArquivoTexto(funcionarios);

        arquivoUtil.fechaArquivo();
    }
}
