package br.com.americanas.atividade.objs;

import br.com.americanas.atividade.interfaces.Produto;

public class Filme implements Produto {
    private String name;
    private Double price;

    public Filme(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
