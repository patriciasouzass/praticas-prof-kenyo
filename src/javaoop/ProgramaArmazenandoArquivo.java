package javaoop;

import javaoop.model.Desenvolvedor;
import javaoop.model.Funcionario;
import javaoop.model.Gerente;
import javaoop.model.Vendedor;
import javaoop.util.ArquivoUtil;

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
