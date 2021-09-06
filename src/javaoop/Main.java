package javaoop;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Funcionario f1 = new Funcionario("Kenyo", "M", 3000);
        Funcionario f2 = new Funcionario("Patricia", "F", 5800);
        Gerente g1 = new Gerente("Marcela", "F", 8900);
        Vendedor v1 = new Vendedor("Cleiton", "M", 2300, 1000);
        Desenvolvedor dev = new Desenvolvedor("Patricia", "F", 17000, "patricia@gmail.com", "12345");
        Cliente cliente = new Cliente("cliente@gmail.com", "2222");

        boolean autenticacaoDev = dev.autentica("patricia@gmail.com", "123345");
        boolean autentiacaoCliente = cliente.autentica("cliente@gmail.com", "2222");

        System.out.printf("Autenticação da %s: %b \n", dev.getNome(),autenticacaoDev);
        System.out.println("Autenticação do Cliente: " + autentiacaoCliente);

        Funcionario[] array = new Funcionario[5];
        array[0] = f1;
        array[1] = f2;
        array[2] = g1;
        array[3] = v1;
        array[4] = dev;

        CalcularFolha folha = new CalcularFolha();
        double total = folha.calcula(array);

        System.out.println("Total da Folha de Pagamento: " + total);

        FileOutputStream fos = new FileOutputStream("funcionarios.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.append(f1.toString());
        bw.newLine();
        bw.append(f2.toString());
        bw.newLine();
        bw.append(g1.toString());
        bw.newLine();
        bw.append(v1.toString());
        bw.newLine();
        bw.append(dev.toString());
        bw.newLine();


        bw.close();
    }
}
