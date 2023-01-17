package br.com.americanas.livraria.produtos;

public class Brinquedo extends Produto{
    int objtype = 4;
    String tipo;

    public Brinquedo(int id, String nome, Double preco, int quantidade) {
        super(id,nome, preco,quantidade);
    }

    public Brinquedo(int id, String nome, Double preco, int quantidade, String tipo) {
        super(id,nome, preco,quantidade);
        this.tipo = tipo;
    }

    public int getObjtype() {
        return objtype;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedos :" +
                "| id=" + id +
                "| Nome='" + nome + '\'' +
                "| Tipo='" + tipo + '\'' +
                "| Preco=" + preco +
                "| Quantidade=" + quantidade +
                '|';
    }
}
