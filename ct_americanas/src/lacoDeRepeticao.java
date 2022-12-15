import java.util.Random;

public class lacoDeRepeticao {
    public static void main(String[] args) {
        boolean estaChovendo = true;
        Random random = new Random();

        while (estaChovendo) {
            System.out.println("Levo meu guarda chuva");
            int aleatorio = random.nextInt(0, 100);
            System.out.println(aleatorio);
            int restoDaDivisao = aleatorio % 2;
            // Outro modo int ePar = restoDaDivisao ==0;
            if (restoDaDivisao == 0) {
                estaChovendo = false;
            } else estaChovendo = true;
        }
        System.out.println("=========================================================");
        estaChovendo = false;
        do {
            System.out.println("Levo meu guarda chuva");
            int aleatorio = random.nextInt(0, 100);
            System.out.println(aleatorio);
            int restoDaDivisao = aleatorio % 2;
            // Outro modo int ePar = restoDaDivisao ==0;
            if (restoDaDivisao == 0) {
                estaChovendo = false;
            } else estaChovendo = true;
        } while (estaChovendo);
    }
}
/*
import java.util.Random;

public class LacoDeRepeticao {

    public static void main(String[] args) {
        // enquanto(estiverChovendo) {carregoMeuGuardaChuvas}
        Random random = new Random();
        boolean estaChovendo = true;

        while (estaChovendo) {
            System.out.println("Levo meu guarda chuva");
            int aleatorio = random.nextInt(0, 100);
            System.out.println("Numero sorteado foi: " + aleatorio);
            int restoDaDivisao = aleatorio % 2;
            boolean ePar = restoDaDivisao == 0;
            // "!" invert o valor de uma variável booleana, se verdadeiro passa a ser falso,
            // se falso passa a ser verdadeiro
            estaChovendo = !ePar;
        }

        // do {} while()
        estaChovendo = false;
        do {
            System.out.println("Levo meu guarda chuva");
            int aleatorio = random.nextInt(0, 100);
            System.out.println("Numero sorteado foi: " + aleatorio);
            int restoDaDivisao = aleatorio % 2;
            boolean ePar = restoDaDivisao == 0;
            estaChovendo = !ePar;
        } while(estaChovendo);

        // para (1 a té 10) {faça}
        // for (declaracao; expressao logica; incremento/decrement de variavel){bloco de código}
        for (int indice = 0; indice < 10; indice++) {
            // (index++) == (index = index + 1) == (index += 1)
            System.out.println(indice);
        }
        for (int indice = 10; indice > 0; indice--) {
            System.out.println(indice);
  }
}

}
*/