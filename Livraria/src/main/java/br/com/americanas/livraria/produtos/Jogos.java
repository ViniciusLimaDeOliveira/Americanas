package br.com.americanas.livraria.produtos;

public class Jogos   extends Produto {
    int objtype=2;
    String distribuidora;
    String generos;
    String estudio;

    public Jogos(int id,String nome, Double preco, String distribuidora, String generos, String estudio) {
        super(id,nome, preco);
        this.distribuidora = distribuidora;
        this.generos = generos;
        this.estudio = estudio;
    }
    public int getObjtype() {
        return objtype;
    }
    public String getDistribuidora() {
        return distribuidora;
    }

    public String getGeneros() {
        return generos;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "objtype='" + objtype + '\'' +
                ", distribuidora='" + distribuidora + '\'' +
                ", generos='" + generos + '\'' +
                ", estudio='" + estudio + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
