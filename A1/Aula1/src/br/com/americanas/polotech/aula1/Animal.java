package br.com.americanas.polotech.aula1;

abstract class Animal {
    Integer tamanho;

    public  void alimentarSe(String alimento){
        System.out.printf("Animal alimentando-se de %s",alimento);
    }

}
