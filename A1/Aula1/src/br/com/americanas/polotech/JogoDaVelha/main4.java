package br.com.americanas.polotech.JogoDaVelha;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String reiniciar = "";

        do {
            try {
                Inicialize();

                System.out.println("Informe o nome do JOGADOR1:");
                String jogador1 = sc.next();
                System.out.println("Informe o nome do JOGADOR2:");
                String jogador2 = sc.next();


                char[][] tabuleiro = {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'}};


                showTabuleiro(tabuleiro);

                boolean verificar = verificaGanhador(tabuleiro, jogador1, jogador2);
                int posicao = 0;
                int n = 0;
                char character;
                String vezDeQuem;


                while ((n <= 9) && verificar == false) {

                    if (n % 2 == 0) {
                        vezDeQuem = jogador1;
                        character = 'X';
                    } else {
                        vezDeQuem = jogador2;
                        character = 'O';
                    }

                    if (n > 8) {
                        System.out.println("AHHHH O JOGO DEU VELHA! EMPATE!!!!");
                        break;
                    }

                    n++;
                    System.out.printf("MOVIMENTO %d: %s ESCOLHA UM NÚMERO correspondente a sua jogada:", n, vezDeQuem);
                    posicao = sc.nextInt();
                    tabComJogada(posicao, tabuleiro, character);
                    verificar = verificaGanhador(tabuleiro, jogador1, jogador2);


                    if (verificar == true) {
                        verificaGanhador(tabuleiro, jogador1, jogador2);
                        System.out.println("Jogo encerrado");
                        break;
                    }

                    while (posicao < 1 || posicao > 9) {
                        System.out.println("Você não escreveu um numero, escreva um número no tabuleiro:");
                        posicao = sc.nextInt();
                        tabComJogada(posicao, tabuleiro, character);
                    }
                }

            } catch (Exception e) {
                System.out.println("Você não digitou um argumento válido\n:( VAMOS ENCERRAR O JOGO :(.");
                System.exit(0);
            }

            System.out.println("Deseja encerrar o jogo? Escreva: SIM para encerrar e NÃO para continuar.");
            reiniciar = sc.next().toUpperCase();
            if (reiniciar.equalsIgnoreCase("SIM")) {
                System.out.println("OK! Jogo encerrado até a próxima");
                System.exit(0);
            }
        } while (reiniciar != "SIM");


    }
}
