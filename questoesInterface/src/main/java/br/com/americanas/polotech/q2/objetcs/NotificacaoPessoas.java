package br.com.americanas.polotech.q2.objetcs;

import br.com.americanas.polotech.q2.interfaces.Inotificacoes;

import java.util.ArrayList;

public class NotificacaoPessoas implements Inotificacoes {
    ArrayList<Pessoa> pessoas;
    String mensagem;

    public NotificacaoPessoas(ArrayList<Pessoa> pessoas,String mensagem) {
        this.pessoas = pessoas;
        this.mensagem = mensagem;
    }

    @Override
    public void dispararNotificacoes() {
        for (Pessoa p:this.pessoas) {
            System.out.println(p.getName()+" received a message: -> "+mensagem);
        }
        for (Pessoa p:this.pessoas) {
            System.out.println("{"+p.getName()+"= received a message: -> "+mensagem+"}");
        }
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoa(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
