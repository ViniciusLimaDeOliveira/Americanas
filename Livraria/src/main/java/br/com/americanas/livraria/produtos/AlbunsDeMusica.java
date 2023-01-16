package br.com.americanas.livraria.produtos;

public class AlbunsDeMusica  extends Produto{
    int objtype = 5;
    String musicosBanda;
    String generos;
    String selos;


    public AlbunsDeMusica(int id,String nome, Double preco) {

        super(id,nome, preco);
    }

    public AlbunsDeMusica(int id,String nome, Double preco, String musicosBanda, String generos, String selos) {
        super(id,nome, preco);
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
        return "AlbunsDeMusica{" +
                "objtype='" + objtype + '\'' +
                ", musicosBanda='" + musicosBanda + '\'' +
                ", generos='" + generos + '\'' +
                ", selos='" + selos + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
