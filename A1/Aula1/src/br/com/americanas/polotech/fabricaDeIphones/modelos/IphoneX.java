package br.com.americanas.polotech.fabricaDeIphones.modelos;

public class IphoneX implements Iphone{
    String so="IOS 11.1.1 ate 13.5",
            tela="5,8 polegadas",
            cpu="Apple A11 Bionic",
            ram="3 GB",
            baterria="2716mAh";
    @Override
    public void exibirDetalhes() {
        this.toString();
    }

    @Override
    public String toString() {
        return "IphoneX{" +
                "so='" + so + '\'' +
                ", tela='" + tela + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", baterria='" + baterria + '\'' +
                '}';
    }
}
