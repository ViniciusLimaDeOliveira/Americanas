package br.com.americanas.polotech.fabricaDeIphones.modelos;

public class Iphone9 implements Iphone{
    String so="IOS 13",
    tela="4,7 polegadas",
    cpu="Apple A13 Bionic",
    ram="3 GB",
    baterria="2050mAh";
    @Override
    public void exibirDetalhes() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Iphone9{" +
                "so='" + so + '\'' +
                ", tela='" + tela + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", baterria='" + baterria + '\'' +
                '}';
    }
}
