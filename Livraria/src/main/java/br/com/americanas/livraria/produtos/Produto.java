package br.com.americanas.livraria.produtos;

public abstract class Produto {

    int objtype = 0;
    int id;
    String nome;
    Double preco;

    int quantidade;

    public Produto(int id,String nome, Double preco,int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(int id) {
        this.id=id;
    }

    public int getObjtype() {
        return objtype;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
