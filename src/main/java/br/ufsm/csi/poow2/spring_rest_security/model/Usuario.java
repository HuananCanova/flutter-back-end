package br.ufsm.csi.poow2.spring_rest_security.model;

public class Usuario {

    private String login;
    private String senha;
    private String permissao;

    private String token;
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Usuario() {
        this.permissao = "USER";
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.permissao = "USER";
    }

    public Usuario(String login, String senha, String permissao) {
        this.login = login;
        this.senha = senha;
        this.permissao = permissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }




}
