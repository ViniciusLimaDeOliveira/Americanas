package br.com.americanas.atividade.generics;

import br.com.americanas.atividade.interfaces.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estoque<T extends Produto>{
    List<T> produtos = new ArrayList<>();

    public  static<T extends Produto>  Optional<T> contains(Estoque<T> es, T t){
        if(es.produtos.contains(t)){
            return Optional.ofNullable(t);
        }
            return Optional.empty();
    }
    public void create(T t) {
        // adicionar produto
        System.out.println("Adicionando produto: " + t);
        produtos.add(t);
    }
    public Optional<T> read(int id) {
        // retornar produto
        System.out.println("Retornando produto: " + produtos.get(id));
        return Optional.ofNullable(produtos.get(id));
    }
    public Optional<List<T>> FindAll(){
        return Optional.ofNullable(produtos);
    }
    public void update(int id, T t) {
        // atualizar produto
        System.out.println("Atualizando produto: " + t);
        produtos.set(id, t);
    }

    public void delete(int id) {
        // deletar produto
        System.out.println("Deletando produto: " + produtos.get(id));
        produtos.remove(id);
    }
}
