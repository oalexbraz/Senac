package com.example.projeto_padrao.models;

import com.example.projeto_padrao.activitys.LoginActivity;
import com.orm.SugarRecord;

public class Usuario extends SugarRecord {
    private String usuario;
    private String email;
    private String senha;
    private Boolean logado;
    private Boolean registrado;

    public Usuario() {
    }

    public Usuario (String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;

    }

      public void logar(LoginActivity loginActivity) {

        this.logado = true;


    }



    public void resgitrar() {

        this.registrado = true;

    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getLogado() {
        return logado;
    }

    public void setLogado(Boolean logado) {
        this.logado = logado;
    }

    public Boolean getRegistrado() {
        return registrado;
    }

    public void setRegistrado(Boolean registrado) {
        this.registrado = registrado;
    }
}

