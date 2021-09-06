package javaoop;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private String sexo;
    private double salario;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public Funcionario(String n, String s, double sal) {
       nome = n;
       sexo = s;

       df.setRoundingMode(RoundingMode.UP);
       String format = df.format(sal);
       salario = Double.valueOf(format);
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getSexo() {
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
                '}';
    }
}
