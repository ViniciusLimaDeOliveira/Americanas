// Solicite ao usuário que informe qual o tamanho, em linhas, da piramide.
// Com o valor informado utilize o print para desenha uma piramide com a
// quantidade de linhas de altura que foi informada pelo usuário
// Exemplo:
// Caso o usuário informe 3
//   *
//  ***
// *****
//Caso o usuário informe 5
//     *
//    ***
//   *****
//  *******
// *********
import java.util.Scanner;

public class PiramideCentralizada {
    public static void main(String[] args) {
        //---*---
        //--***--
        //-*****-
        //*******
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura da piramide");
        int altura = scanner.nextInt();
        int indiceEstrela=1;
        int quatidadeEstrela=1;
        for (int linha = 0; linha < altura; linha++) {
            int trasoPorLado = altura-indiceEstrela;
            //Desenha os traços de um lado da piramide
            for(int i=0;i<trasoPorLado;i++){
                System.out.print("-");
            }
            //Desenha as estrelas da piramide
            for(int e=0;e<quatidadeEstrela;e++){
                System.out.print("*");
            }
            //Desenha os traços do outro lado da piramide
            for(int j=0;j<trasoPorLado;j++){
                System.out.print("-");
            }
            System.out.println("");
            quatidadeEstrela+=2;
            indiceEstrela+=1;
            }
        }
    }
