package br.com.americas.atividade;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {
    LocalDateTime timeStamp;
    String nomeUser;
    String mensagem;
    public Mensagem(String nome, String mensagem, LocalDateTime data) {
        this.nomeUser = nome;
        this.mensagem = mensagem;
        this.timeStamp = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
        String dateTimeString = timeStamp.format(formatter);
        return "@"+nomeUser + "\n   " + mensagem + "\n " + dateTimeString ;
    }
}
