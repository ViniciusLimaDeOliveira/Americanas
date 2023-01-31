package br.com.americanas.polotech.q2;

import br.com.americanas.polotech.q2.objetcs.NotificacaoPessoas;
import br.com.americanas.polotech.q2.objetcs.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Digite o numero de pessoas a receber a notificação:");
            int quantidadePessoas = scanner.nextInt();
            scanner.nextLine();
            if(quantidadePessoas==0){
                System.exit(0);
            }else {
                ArrayList<Pessoa> pessoas=new ArrayList<Pessoa>();
                for(int i = 0;i<quantidadePessoas;i++){
                    System.out.println("Qual nome da "+i+" pessoa a ser notificada?:");
                    String nome = scanner.nextLine();
                    Pessoa a = new Pessoa(nome);
                    pessoas.add(a);
                }
                System.out.println("Digite a mensagens da notificaçõa:");
                String mensagem = scanner.nextLine();
                NotificacaoPessoas notificacaoPessoas = new NotificacaoPessoas(pessoas,mensagem);
                notificacaoPessoas.dispararNotificacoes();
            }
        }
    }
}
