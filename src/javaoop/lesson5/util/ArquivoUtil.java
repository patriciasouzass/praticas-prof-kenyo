package javaoop.lesson5.util;


import javaoop.lesson5.exception.FuncionarioExistenteException;
import javaoop.lesson5.exception.PersistenciaException;
import javaoop.lesson5.model.Funcionario;

import java.io.*;

public class ArquivoUtil {

    private BufferedWriter bw;

    public ArquivoUtil(){
        FileOutputStream fos;

        try {
            fos = new FileOutputStream("funcionarios.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
        } catch (FileNotFoundException e){
            System.out.println("deu pau!");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario funcionario){
        try{
            funcionarioExistente(funcionario);
            bw.append(funcionario.toString());
            bw.newLine();
        } catch (IOException e){
            // nesse caso exige o throws na assinatura do método
            throw new PersistenciaException("erro ao persistir o registro no arquivo");
        } catch (FuncionarioExistenteException e){
            throw new FuncionarioExistenteException(e);
        }

    }

    public void funcionarioExistente(Funcionario funcionario){
        if(false){
            throw new FuncionarioExistenteException("funcionário já cadastrado");
        }
    }

    public void escreveObjetoArquivoTexto(Funcionario[] funcionarios){
        for(int i=0; i<funcionarios.length; i++){
            escreveObjetoArquivoTexto(funcionarios[i]);
        }
    }

    public void fechaArquivo(){
        try{
            bw.close();
        } catch (IOException e){
            System.out.println("deu pau!");
        }
    }


}
