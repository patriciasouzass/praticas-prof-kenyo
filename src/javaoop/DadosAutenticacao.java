package javaoop;

public class DadosAutenticacao {

    private String login;
    private String senha;

    public DadosAutenticacao(String l, String s){
        login = l;
        senha = s;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
