public class QuadradoPerfeito {

    public static void main(String[] args) {
        int[][] matriz = montarEPreencheQuadradoPerfeito();
        int[] somaLinhas = totalDaLinha(matriz);
        int[] somaColunas = totalDaColuna(matriz);
        int superiorDiagonal = totalSuperiorDiagonal(matriz);
        int inferiorDiagonal = totalInferiorDiagonal(matriz);

        System.out.println("Soma das Linhas");
        for (int i:somaColunas) System.out.print(i+" ");
        System.out.println();
        System.out.println("Soma das Colunas");
        for (int i:somaColunas) System.out.print(i+" ");
        System.out.println();
        System.out.println("Soma da diagonal superiror : ");
        System.out.println(superiorDiagonal);
        System.out.println("Soma da diagonal inferior : ");
        System.out.println(inferiorDiagonal);
        System.out.println();

        if(eMatrizQuadradaPerfeita(somaLinhas,somaColunas,inferiorDiagonal,superiorDiagonal)){
            System.out.println("A matriz é Quadrado perfeito !");
        }else System.out.println("A matriz não é um Quadrado perfeito !");
    }
    public static boolean eMatrizQuadradaPerfeita(int[] somaLinhas,int[] somaColunas,int inferiorDiagonal,int superiorDiagonal){
      boolean eQuadrado=true;
      if(inferiorDiagonal==superiorDiagonal){
          if(somaColunas.length==somaLinhas.length)
          for (int linha=0;linha<somaLinhas.length;linha++){
              for (int coluna=0;coluna<somaColunas.length;coluna++){
                    if(somaLinhas[linha]!=somaColunas[coluna]
                    ||somaColunas[linha]!=inferiorDiagonal
                    ||somaColunas[linha]!=superiorDiagonal
                    ||somaColunas[coluna]!=inferiorDiagonal
                    ||somaColunas[coluna]!=superiorDiagonal
                    ){
                        eQuadrado=false;
                        break;
                    }
              }
          }
      }else eQuadrado=false;
      return eQuadrado;
    };
    public static int totalSuperiorDiagonal(int[][] matriz){
        int soma=0;
        int aux = matriz.length-1;
        for (int linha=0;linha<matriz.length;linha++){
            soma+=matriz[linha][aux-linha];
        }
        return soma;
    }
    public static int totalInferiorDiagonal(int[][] matriz){
        int soma=0;
        for (int linha=0;linha<matriz.length;linha++){
            soma+=matriz[linha][linha];
        }
        return soma;
    }

    public static int[][] montarEPreencheQuadradoPerfeito() {
        int[][] matriz = {
                {20,6,7,17},
                {9,15,14,12},
                {13,11,10,16},
                {8,18,19,5}
        };
        // matriz1 Não e uma quadrado perfeito
        int [][] matriz1 = {
                {1 ,9, 4},
                {7 ,8 ,4},
                {9 ,4, 8}
        };
        return matriz;
    }
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
}