package br.com.americanas.polotech.fabricaDeIphones.modelos;

public class Iphone13Mini implements Iphone{
    String so="IOS 15",
            tela="5,4 polegadas",
            cpu="Apple A15 Bionic",
            ram="4 GB",
            baterria="2438mAh";
    @Override
    public void exibirDetalhes() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Iphone13Mini{" +
                "so='" + so + '\'' +
                ", tela='" + tela + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", baterria='" + baterria + '\'' +
                '}';
    }
}
