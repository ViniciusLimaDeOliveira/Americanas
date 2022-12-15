import java.util.Scanner;

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
public class questaoLosango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a tamanho do losangulo? (Tamanho minimo 5)");
        int colunas = scanner.nextInt();
        if (colunas < 5) {
            System.out.println("Tamanho minimo não alcaçado,informe um numero maior que 4 !!");
            System.exit(1);
        } else {
            int espaco = 0;
            int metadeQuantidadeEstrela = 0;
            boolean epar;
            if ((colunas % 2) == 0) {
                epar = true;
            } else epar = false;

            for (int linha = 0; linha < colunas; linha++) {
                if (espaco == 0) { // Imprime a linha onde o espaço entre os * e zero;
                    for (int i = 0; i < colunas; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    espaco++;
                } else {// Imprime a linha aonde tem espaço entre os *;
                    metadeQuantidadeEstrela = (colunas / 2) - espaco;
                    for (int j = 0; j < metadeQuantidadeEstrela; j++) {
                        System.out.print("*");
                    }
                    if (epar) {//Se numero de colunas for par espaço e calculado diferente
                        for (int i = 0; i < espaco * 2; i++) {
                            System.out.print("-");
                        }
                    } else {//Se numero de colunas for impar espaço e calculado diferente
                        for (int i = 0; i < espaco; i++) {
                            System.out.print("-");
                        }
                    }
                    for (int j = 0; j < metadeQuantidadeEstrela; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    espaco+=2;
                }

            }
        }
    }
}
/*
            for(int linha=0;linha<colunas;linha++){
                if(epar)
                metadeQuantidadeEstrela = (colunas/2)-espaco;
                else metadeQuantidadeEstrela = ((colunas/2)-espaco)+1;

                for (int j=0;j<=metadeQuantidadeEstrela;j++){
                    System.out.print("*");
                }
                for(int i=0;i<espaco*2;i++){
                    System.out.print("-");
                }
                for (int j=0;j<=metadeQuantidadeEstrela;j++){
                    System.out.print("*");
                }
                System.out.println();
                espaco++;
            }

*/

