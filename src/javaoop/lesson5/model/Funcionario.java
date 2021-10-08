package javaoop.lesson5.model;

import javax.swing.text.MaskFormatter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Funcionario {

    private String nome;
    private String sexo;
    private double salario;
    private String cpf;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public Funcionario(String nome, String sexo, double salario, String cpf) throws ParseException {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = formatarCpf(cpf);

        df.setRoundingMode(RoundingMode.UP);
        String format = df.format(salario).replace(",", ".");
        this.salario = Double.valueOf(format);
    }

    public String formatarCpf(String cpf) throws ParseException {
        MaskFormatter mf = new MaskFormatter("###.###.###-##");
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getSexo(){
        return sexo;
    }

    public double getSalario() {
        return salario;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                ", cpf=" + cpf +
                '}';
    }
}