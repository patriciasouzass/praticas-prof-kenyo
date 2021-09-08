package javaoop.lesson5.model;

import javaoop.lesson5.exception.LoginException;

public class Desenvolvedor extends Funcionario implements UsuarioAutenticavel {

    private DadosAutenticacao dadosAutenticacao;

    public Desenvolvedor(String nome, String sexo, double salario, String login, String senha) {
        super(nome, sexo, salario);
        dadosAutenticacao = new DadosAutenticacao(login, senha);
    }

    @Override
    public void autentica(String login, String senha) {
        if (login.equals(dadosAutenticacao.getLogin()) && senha.equals(dadosAutenticacao.getSenha())){
            // escreve codigo que encaminha requisiçao para a pagina
            System.out.println("usuario logado");
        } else {
            throw new LoginException("erro no login");
        }
    }
}
