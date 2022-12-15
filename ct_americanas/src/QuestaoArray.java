/*
Enunciado
Dado um array de n posições, todas preenchidas com números inteiros, crie um algoritmo capaz de ordenar o array
e colocar os números em ordem crescente.

Exemplo:

[4,7,5,1,18,9]
Deve ser ordenado para:

[1,4,5,7,9,18]
Regras:

O array deve ser criado com o tamanho informado pelo usuário.
O preenchimento deve ser feito com números gerados aleatoriamente.
A ordenação deve ocorrer de forma crescente, conforme mostrado no exemplo.
Deve ser impresso o array antes da ordenação e após, assim possibilitando a comparação visual.*/
import java.util.Random;
import java.util.Scanner;
public class QuestaoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoArray=0;
        System.out.println("Informe o tamanho do Array: ");
        tamanhoArray = scanner.nextInt();
        int[] numeros = criarEPreencheArray(tamanhoArray);
        System.out.println("Original:");
        imprimir(numeros);
        ordenarCrescente(numeros,0,(numeros.length - 1));
        System.out.println("Ordenado de forma cresente:");
        imprimir(numeros);
    }
    public static int[] criarEPreencheArray(int tamanho) {
        Random random = new Random();
        int range=100;
        int vetor[]= new int[tamanho];

        // Para dar mais variedade nos numeros
        if(tamanho>range){
            if(tamanho*2<Integer.MAX_VALUE){
                range=tamanho*2;
            }
            else range = Integer.MAX_VALUE-1;
        }

        for(int i=0;i<tamanho;i++){
            vetor[i]= random.nextInt(0, range);
        }
        return vetor;
    };

    // Metodo de ordenação Quicksort
    public static void ordenarCrescente(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            // Particiona e retorna o id pivo
            int id_pivotante = particao(vetor, esquerda, direita);
            //Chamadas recursivas
            ordenarCrescente(vetor, esquerda, id_pivotante - 1);
            ordenarCrescente(vetor, id_pivotante + 1, direita);
        }
    }

    public static int particao(int[] vetor, int esquerda, int direita) {
       // ordena os menores que o pivo para esquerda e maiores para direita
      int id=esquerda;
      int pivo = vetor[esquerda];
      for(int i=esquerda+1;i<=direita;i++){
          if(vetor[i]<=pivo){
              id+=1;
              int aux = vetor[id];
              vetor[id]=vetor[i];
              vetor[i]=aux;
          }
      }
        //Posiona o pivo na sua posição
        int aux = vetor[esquerda];
        vetor[esquerda]=vetor[id];
        vetor[id]=aux;
        //retorna a posisão do pivo
        return id;
    };

    public static void imprimir(int[] vetor){
        System.out.print("O vetor é | ");
        for (int numero:vetor){
            System.out.print(" ["+numero+"] ");
        }
        System.out.println(" |");
    }
}
