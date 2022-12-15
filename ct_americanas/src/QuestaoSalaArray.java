/*
*Dado um array de números inteiros deve ser feito a inversão das posições.
Exemplo de array original:
[1,5,9,65,2,4]
Resultado esperado:
[4,2,65,9,5,1]
*/
import java.util.Random;

public class QuestaoSalaArray {
    public static void main(String[] args) {

        int[] numeros = criarEPreencheArray();

        imprimir(numeros);
        numeros=inverterterArray(numeros);
        imprimir(numeros);
    }
    public static int[] inverterterArray(int[] vetor){
        int tamanhoVetor=vetor.length-1;
        int aux,metade=0;
        if(tamanhoVetor%2==0){
            metade=tamanhoVetor/2;
        } else metade=(tamanhoVetor/2)+1;
        for(int i=0;i<metade;i++){
            aux=vetor[i];
            vetor[i]=vetor[tamanhoVetor-i];
            vetor[tamanhoVetor-i]=aux;
        }
        return vetor;
    };
    public static void imprimir(int[] vetor){
        System.out.print("O vetor é | ");
        for (int numero:vetor){
            System.out.print(" ["+numero+"] ");
        }
        System.out.println(" |");
    }
    public static int[] criarEPreencheArray() {
        Random random = new Random();
        return new int[] {
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100)
        };
    }

}
