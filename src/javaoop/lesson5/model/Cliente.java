package javaoop.lesson5.model;

import javaoop.lesson5.exception.LoginException;

public class Cliente implements UsuarioAutenticavel {

    private DadosAutenticacao dadosAutenticacao;

    public Cliente(String login, String senha){
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
