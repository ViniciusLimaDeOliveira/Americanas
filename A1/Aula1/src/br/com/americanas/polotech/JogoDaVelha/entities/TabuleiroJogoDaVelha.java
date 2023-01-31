package br.com.americanas.polotech.JogoDaVelha.entities;

import br.com.americanas.polotech.JogoDaVelha.interfaces.ITabuleiro;

public class TabuleiroJogoDaVelha implements ITabuleiro {

    public static void tabComJogada(int posicao, char[][] tabuleiro, char character) {

        switch (posicao) {
            case 1:
                tabuleiro[0][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 2:
                tabuleiro[0][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 3:
                tabuleiro[0][2] = character;
                showTabuleiro(tabuleiro);
                break;
            case 4:
                tabuleiro[1][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 5:
                tabuleiro[1][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 6:
                tabuleiro[1][2] = character;
                showTabuleiro(tabuleiro);
                break;
            case 7:
                tabuleiro[2][0] = character;
                showTabuleiro(tabuleiro);
                break;
            case 8:
                tabuleiro[2][1] = character;
                showTabuleiro(tabuleiro);
                break;
            case 9:
                tabuleiro[2][2] = character;
                showTabuleiro(tabuleiro);
                break;

            default:
                break;
        }
    }

    public static void showTabuleiro(char[][] tabuleiro) {

        for (char[] row : tabuleiro) {
            for (char collumn : row) {
                System.out.print(collumn + "   ");
            }
            System.out.println();
        }
    }

    @Override
    public Boolean verificaGanhador(char[][] tabuleiro, Jogador jogador1, Jogador jogador2) {
        if (tabuleiro[0][0] == 'X' && tabuleiro[1][0] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][1] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][1] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][2] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[0][1] == 'X' && tabuleiro[0][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[1][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[1][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[2][0] == 'X' && tabuleiro[2][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][0] == 'X') {
            System.out.println(jogador1 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][0] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][1] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][1] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][2] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[0][1] == 'O' && tabuleiro[0][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[1][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[1][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[2][0] == 'O' && tabuleiro[2][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        if (tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        } else if (tabuleiro[0][2] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][0] == 'O') {
            System.out.println(jogador2 + " VENCEU A PARTIDA!");
            return true;
        }

        return false;
    }
}
