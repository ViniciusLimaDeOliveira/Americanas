package br.com.americanas.atividade;

import br.com.americanas.atividade.generics.Estoque;
import br.com.americanas.atividade.objs.Brinquedo;
import br.com.americanas.atividade.objs.Livro;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Estoque<Brinquedo> brinquedos = new Estoque<>();
        Estoque<Livro> livros = new Estoque<>();
        Brinquedo b = new Brinquedo("Teste",12.0);
        Brinquedo b2 = new Brinquedo("STW",25.0);
        brinquedos.create(b);
        Livro l = new Livro("TEsteLivro",48.90);
        livros.create(l);


        System.out.println(Estoque.contains(brinquedos,b2));
        brinquedos.create(b2);
        System.out.println(Estoque.contains(brinquedos,b2));
        //System.out.println(brinquedos.read(0));
        //System.out.println(livros.read(0));
    }


}
