package br.com.americanas.livraria.produtos;

public class Filme extends Produto {
    int objtype = 3;
    String estudio;
    String diretores;
    String generos;
    String produtores;

    public Filme(int id, String nome, Double preco, int quantidade) {
        super(id,nome, preco, quantidade);
    }

    public Filme(int id, String nome, Double preco, int quantidade, String estudio, String diretores, String generos, String produtores) {
        super(id,nome, preco,quantidade);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public Filme(int id) {
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
        return "Filmes :" +
                "| id=" + id +
                "| Nome='" + nome + '\'' +
                "| Estudio='" + estudio + '\'' +
                "| Diretores='" + diretores + '\'' +
                "| Generos='" + generos + '\'' +
                "| Produtores='" + produtores + '\'' +
                "| Preco=" + preco +
                "| Quantidade=" + quantidade +
                '|';
    }
}
