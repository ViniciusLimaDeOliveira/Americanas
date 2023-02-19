package br.com.americanas.atividade.objs;

import br.com.americanas.atividade.interfaces.Produto;

public class Livro implements Produto {
    private String name;
    private Double price;

    public Livro(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
