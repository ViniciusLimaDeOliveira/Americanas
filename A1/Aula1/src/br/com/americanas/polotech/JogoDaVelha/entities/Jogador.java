package br.com.americanas.polotech.JogoDaVelha.entities;

public class Jogador {
    String nome;
    char token;

    public Jogador(String nome, char token) {
        this.nome = nome;
        this.token = token;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getToken() {
        return token;
    }

    public void setToken(char token) {
        this.token = token;
    }
}
