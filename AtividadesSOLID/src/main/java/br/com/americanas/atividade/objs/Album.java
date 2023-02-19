package br.com.americanas.atividade.objs;

import br.com.americanas.atividade.interfaces.Produto;

public class Album implements Produto {
    private String name;
    private Double price;

    public Album(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
