package br.com.americanas.livraria.produtos;

public class Filmes  extends Produto {
    int objtype = 3;
    String estudio;
    String diretores;
    String generos;
    String produtores;

    public Filmes(int id,String nome, Double preco) {
        super(id,nome, preco);
    }

    public Filmes(int id,String nome, Double preco, String estudio, String diretores, String generos, String produtores) {
        super(id,nome, preco);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public Filmes(int id) {
        super(id);
    }

    public int getObjtype() {
        return objtype;
    }

    public String getEstudio() {
        return estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public String getGeneros() {
        return generos;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "objtype='" + objtype + '\'' +
                ", estudio='" + estudio + '\'' +
                ", diretores='" + diretores + '\'' +
                ", generos='" + generos + '\'' +
                ", produtores='" + produtores + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
