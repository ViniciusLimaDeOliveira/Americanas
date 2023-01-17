package br.com.americanas.livraria.produtos;

public class AlbunDeMusica extends Produto{
    int objtype = 5;
    String musicosBanda;
    String generos;
    String selos;


    public AlbunDeMusica(int id, String nome, Double preco, int quantidade) {

        super(id,nome, preco, quantidade);
    }

    public AlbunDeMusica(int id, String nome, Double preco, int quantidade, String musicosBanda, String generos, String selos) {
        super(id,nome, preco,quantidade);
        this.musicosBanda = musicosBanda;
        this.generos = generos;
        this.selos = selos;
    }

    public int getObjtype() {
        return objtype;
    }

    public String getMusicosBanda() {
        return musicosBanda;
    }

    public String getGeneros() {
        return generos;
    }

    public String getSelos() {
        return selos;
    }

    public void setMusicosBanda(String musicosBanda) {
        this.musicosBanda = musicosBanda;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }

    @Override
    public String toString() {
        return "Albun De Musica : " +
                "| id=" + id +
                "| Nome='" + nome + '\'' +
                "| Musicos da banda='" + musicosBanda + '\'' +
                "| Generos ='" + generos + '\'' +
                "| Selos ='" + selos + '\'' +
                "| Preco=" + preco +
                "| Quantidade = " + quantidade +
                '|';
    }
}
