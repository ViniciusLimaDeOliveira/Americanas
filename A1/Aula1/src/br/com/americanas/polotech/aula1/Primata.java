package br.com.americanas.polotech.aula1;

public class Primata extends Animal{
    @Override
    public  void alimentarSe(String alimento){
        System.out.printf("Primata alimentando-se de %s",alimento);
    }
}
