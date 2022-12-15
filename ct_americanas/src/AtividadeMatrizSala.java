import java.util.Random;
import java.util.Scanner;

public class AtividadeMatrizSala {
    public static void main(String[] args) {
        int tamanho = obtemTamanho();
        int[][] quadrado = gerarQuadrados(tamanho);
        imprimeMatriz(quadrado);
        int[] somaLinhas = totalDaLinha(quadrado);
        int[] somaColunas = totalDaColuna(quadrado);

        int maiorLinha = encontrarLinhaComMaiorSomatoria(somaLinhas);
        int maiorColuna = encontrarColunaComMaiorSomatoria(somaColunas);
        System.out.println("A linha com maior soma é a linha número " + maiorLinha + " Com soma "+somaLinhas[maiorLinha] );
        iprimeLinha(maiorLinha, quadrado);
        System.out.println("A linha com maior soma é a coluna número " + maiorColuna + " Com soma "+somaColunas[maiorColuna]);
        iprimeColuna(maiorColuna, quadrado);
    };
    public static int encontrarLinhaComMaiorSomatoria(int[] somaLinhas){
        int max=-1;
        int id=0;
        for (int i=0;i<somaLinhas.length;i++){
            if(max<somaLinhas[i]){
                max=somaLinhas[i];
                id=i;
            }
        }
        return id;
    };

    public static int encontrarColunaComMaiorSomatoria(int[] somaColunas){
        int max=-1;
        int id=0;
        for (int i=0;i<somaColunas.length;i++){
            if(max<somaColunas[i]){
                max=somaColunas[i];
                id=i;
            }
        }
        return id;
    };
    public static int[] totalDaLinha(int[][] matriz) {

        int[] somaLinhas = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            somaLinhas[i] = somaLinha;
        }
        return somaLinhas;
    };

    public static int[] totalDaColuna(int[][] matriz) {

        int[] somaColunas = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaColuna += matriz[j][i];
            }
            somaColunas[i] = somaColuna;
        }
        return somaColunas;
    };

    public static int obtemTamanho() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho da matriz quadrada ?");
        int numero = scanner.nextInt();
        if (numero < 0) {
            return obtemTamanho();
        } else {
            return numero;
        }
    };

    public static int[][] gerarQuadrados(int tamanho) {
        int[][] matriz = new int[tamanho][tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = random.nextInt(0, 10);
            }
        }
        return matriz;
    };

    public static void imprimeMatriz(int[][] matriz) {
        System.out.println("A Matriz é ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" [" + matriz[i][j] + "] | ");
            }
            System.out.println(" }");
        }
    }
    public static void iprimeLinha(int id, int[][] matriz) {
                System.out.print("{ ");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print("[" + matriz[id][j] + "]");
                }
                System.out.println(" }");
    }
    public static void iprimeColuna(int id, int[][] matriz) {
        System.out.print("{ ");
        for (int j = 0; j < matriz.length; j++) {
            System.out.print("[" + matriz[j][id] + "]");
        }
        System.out.println(" }");
    }
/*
    public static void iprimeLinha(int id, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (i == id) {
                System.out.print("{ ");
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
                System.out.println("}");
            }
        }
    }

    public static void iprimeColuna(int id, int[][] matriz) {
        System.out.print("{ ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == id) {
                    System.out.print("[" + matriz[i][j] + "]");
                }
            }
        }
        System.out.println(" }");
    }*/

}
