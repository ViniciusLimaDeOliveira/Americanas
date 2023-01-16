package br.com.americanas.livraria.produtos;

public abstract class Produto {

    int objtype = 0;
    int id;
    String nome;
    Double preco;
    public Produto(int id,String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
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

}
