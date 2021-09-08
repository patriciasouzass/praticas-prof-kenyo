package javaoop.lesson4.model;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private String sexo;
    private double salario;

    private static DecimalFormat df = new DecimalFormat("#.##");

    public Funcionario(String nome, String sexo, double salario) {
       this.nome = nome;
       this.sexo = sexo;

       df.setRoundingMode(RoundingMode.UP);
       String format = df.format(salario).replace(",",".");
       this.salario = Double.valueOf(format);
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
                '}';
    }
}
