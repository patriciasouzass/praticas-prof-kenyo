package javaoop.lesson4.util;

import javaoop.lesson4.model.Funcionario;

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

    public void escreveObjetoArquivoTexto(Funcionario funcionario) throws IOException{
        bw.append(funcionario.toString());
        bw.newLine();
    }

    public void escreveObjetoArquivoTexto(Funcionario[] funcionarios) throws IOException{
        for (int i=0; i<funcionarios.length; i++){
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
