package br.com.americanas.livraria.produtos;

public class Jogo extends Produto {
    int objtype=2;
    String distribuidora;
    String generos;
    String estudio;

    public Jogo(int id, String nome, Double preco, int quantidade, String distribuidora, String generos, String estudio) {
        super(id,nome, preco, quantidade);
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
        return "Jogos :" +
                "| id=" + id +
                "| Nome='" + nome + '\'' +
                "| Distribuidora='" + distribuidora + '\'' +
                "| Generos='" + generos + '\'' +
                "| Estudio='" + estudio + '\'' +
                "| Preco=" + preco +
                "| Quantidade=" + quantidade +
                '|';
    }
}
