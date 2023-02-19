package br.com.americanas.atividade.objs;

import br.com.americanas.atividade.interfaces.Produto;

public class Brinquedo implements Produto {
    private String name;
    private Double price;

    public Brinquedo(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
