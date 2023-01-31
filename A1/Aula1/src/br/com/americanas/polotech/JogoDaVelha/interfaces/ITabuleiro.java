package br.com.americanas.polotech.JogoDaVelha.interfaces;

import br.com.americanas.polotech.JogoDaVelha.entities.Jogador;

public interface ITabuleiro {
    Boolean verificaGanhador(char[][] tabuleiro, Jogador jogador1, Jogador jogador2);
    void showTabuleiro(char[][] tabuleiro);
}
