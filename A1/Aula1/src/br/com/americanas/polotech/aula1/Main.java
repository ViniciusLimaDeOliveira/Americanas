package br.com.americanas.polotech.aula1;

public class Main {
    public static void main(String[] args) {
            Animal animal = new Primata();
            animal.alimentarSe("Banana");
            System.out.println();
            Animal mf = new Mamifero();
            mf.alimentarSe("Cenora");
            comer(mf);
            System.out.println();
            Animal pr = new Primata();
            pr.alimentarSe("noz");

    }
    public static void comer(Animal animal){
        ((Mamifero) animal ).mamar();
    }

}
