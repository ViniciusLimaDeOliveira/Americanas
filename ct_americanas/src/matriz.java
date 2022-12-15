import java.util.Formattable;
import java.util.Random;
import java.util.Scanner;

public class matriz {
        public static void main(String[] args) {
            //declaração de matriz
            //tipo[linhas][colunas] nome = valor
            int[][] matrizDeInteiros = new int[2][];
            Scanner scanner= new Scanner(System.in);
            //Adicionar valor a matriz
            matrizDeInteiros[0] = new int[5];
            matrizDeInteiros[0][0] = 1;
            matrizDeInteiros[0][1] = 3;
            matrizDeInteiros[0][2] = 5;
            matrizDeInteiros[0][3] = 7;
            matrizDeInteiros[0][4] = 9;

            //Adicionar valor a matriz
            matrizDeInteiros[1] = new int[]{0, 2, 4, 6, 8};

            //Mesmos valores que a matrizDeInteiros
            int[][] novaMatrizDeInteiros = {
                    {1,3,5,7,9},
                    {0,2,4,6,8}
             };
            int linhas,colunas;
            System.out.println("Quantidade de linhas da matriz ?");
            linhas = scanner.nextInt();
            System.out.println("Quantidade de colunas da matriz ?");
            colunas = scanner.nextInt();
            int[][] matriz=criarEPreencheMatriz(linhas,colunas);
            imprimir(matriz);
            System.out.println("O numero maximo é : "+findMaxNumber(matriz));
            System.out.println("O numero minimo é : "+findMinNumber(matriz));
            System.out.println("O numero media é : "+findMedia(matriz));

 }
        public static int findMaxNumber(int[][] matriz){
            int max=-1;
            for (int i=0; i< matriz.length;i++){
                for (int j=0; j< matriz[0].length;j++){
                    if(max<=matriz[i][j]){
                        max=matriz[i][j];
                    }
                }
            }
            return max;
        }
    public static int findMinNumber(int[][] matriz){
        int min=Integer.MAX_VALUE;
        for (int i=0; i< matriz.length;i++){
            for (int j=0; j< matriz[0].length;j++){
                if(min>=matriz[i][j]){
                    min=matriz[i][j];
                }
            }
        }
        return min;
    }
    public static Double findMedia(int[][] matriz){
        int soma=0;
        Double media;
        for (int i=0; i< matriz.length;i++){
            for (int j=0; j< matriz[0].length;j++){
                soma+=matriz[i][j];
            }
        }
        media= soma/Double.valueOf(matriz.length*matriz[0].length);
        return media;
    }
        public static int[][] criarEPreencheMatriz(int linhas,int colunas) {
            Random random = new Random();
            int range=1000;
            int matri[][]= new int[linhas][colunas];

            for(int i=0;i<linhas;i++){
                for (int j=0;j<colunas;j++) {
                    matri[i][j] = random.nextInt(0, range);
                }
            }
            return matri;
        };
    public static void imprimir(int[][] matriz){
        System.out.println("A Matriz é ");
        for (int i=0; i< matriz.length;i++){
            System.out.print("{ ");
            for (int j=0; j< matriz[0].length;j++){
                System.out.print(" ["+matriz[i][j]+"] | ");
            }
            System.out.println(" }");
        }
    }

}
