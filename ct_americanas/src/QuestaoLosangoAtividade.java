/*
Nesse exercício deve ser desenhado um losangulo no console. Para isso teremos as seguintes regras:

O usuário deve informar o tamanho do losangulo, esse tamanho trata da quantidade de colunas a serem utilizadas.
O tamanho mínimo para o desenho é de 5 colunas. Não existe limitação para o tamanho máximo.
Exemplos:
Caso o usuário informe tamanho de 5

*****
** **
*   *
** **
*****
Caso o usuário informe o tamanho de 7

*******
*** ***
**   **
*     *
**   **
*** ***
*******
Caso o usuário informe o tamanho de 10

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********

 */
import java.util.Scanner;
public class QuestaoLosangoAtividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a tamanho do losangulo? (Tamanho minimo 5)");
        int colunas = scanner.nextInt();
        if (colunas < 5) {
            System.out.println("Tamanho minimo não alcaçado,informe um numero maior que 4 !!");
            System.exit(1);
        } else {
            int primeiraMetade,segundaMetade,espaco=0;
            int quantidadeEstrela;
            if(colunas%2==0){// Se quantidade de colunas for par
                primeiraMetade=(colunas/2);
                segundaMetade=colunas-(primeiraMetade+1);
            }else {// Se quantidade de colunas for impar
                primeiraMetade=(colunas/2)+1;
                segundaMetade=colunas-primeiraMetade;
            }
            //Primeira metade do losango contando com o centro;
            for (int linha=0;linha<primeiraMetade;linha++){
                if (espaco == 0) { // Imprime a linha onde o espaço entre os * e zero;
                    for (int index = 0; index < colunas; index++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    if(colunas%2==0){
                        espaco+=2;
                    }else espaco+=1;

                }
                else{ //Quando o espaço e maior que 0
                    quantidadeEstrela = (colunas-espaco)/2;
                    for (int index=0;index<quantidadeEstrela;index++){
                        System.out.print("*");
                    }
                    for (int index=0;index<espaco;index++){
                        System.out.print(" ");
                    }
                    for (int index=0;index<quantidadeEstrela;index++){
                        System.out.print("*");
                    }
                    System.out.println();
                    if(quantidadeEstrela>=2) espaco+=2;
                }
            }
            //Segunda metade do losango
            for (int linha=0;linha<segundaMetade;linha++){
                espaco-=2;
                if (espaco <= 0) { // Imprime a linha final, onde o espaço vai ser menor igual a zero;
                    for (int index = 0; index < colunas; index++) {
                        System.out.print("*");
                    }
                }
                else{ //Quando a quantidade de espaços é maior que 0;
                    quantidadeEstrela = (colunas-espaco)/2;
                    for (int index=0;index<quantidadeEstrela;index++){
                        System.out.print("*");
                    }
                    for (int index=0;index<espaco;index++){
                        System.out.print(" ");
                    }
                    for (int index=0;index<quantidadeEstrela;index++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}