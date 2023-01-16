package br.com.americanas.polotech.aula1;

public class Mamifero extends Animal{
    Integer tamanho;
    public Mamifero(){

    }
    public void mamar(){
        System.out.printf(" Bebeu leite");
    }
    @Override
    public  void alimentarSe(String alimento){
        System.out.printf("Mamifero alimentando-se de %s",alimento);
    }
}
