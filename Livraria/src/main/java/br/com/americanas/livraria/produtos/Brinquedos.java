package br.com.americanas.livraria.produtos;

public class Brinquedos   extends Produto{
    int objtype = 4;
    String tipo;

    public Brinquedos(int id,String nome, Double preco) {
        super(id,nome, preco);
    }

    public Brinquedos( int id,String nome, Double preco, String tipo) {
        super(id,nome, preco);
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
        return "Brinquedos{" +
                "objtype='" + objtype + '\'' +
                ", tipo='" + tipo + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
