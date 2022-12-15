import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        int Asteriscos = 0;
        int tamEspaco = 0;
        int superior = 0;
        int inferior = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do Losango");
        int numCol = scan.nextInt();

        if (numCol % 2 == 0) {
            /* dois espaços */

            superior = numCol / 2;
            inferior = numCol - (superior + 1);
            tamEspaco = +2;

        } else {
            /* um espaco */
            superior = (numCol / 2) + 1;
            inferior = numCol - superior;
            tamEspaco = +1;
        }

        for (int linha = 1; linha <= superior; linha++) {
            if (linha == 1) {
                for (int col = 1; col <= numCol; col++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                Asteriscos = (numCol - tamEspaco) / 2;
                for (int col = 1; col <= Asteriscos; col++) {
                    System.out.print("*");

                }
                for (int col = 1; col <= tamEspaco; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= Asteriscos; col++) {
                    System.out.print("*");
                }
                System.out.println();

                if(Asteriscos >= 2) {
                    tamEspaco += 2;
                }
            }
        }
        tamEspaco-=2;
        for (int linha = 1; linha <= inferior; linha++) {
            if (tamEspaco <= 0) {
                for (int col = 1; col <= numCol; col++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                tamEspaco -= 2;
                Asteriscos = (numCol - tamEspaco) / 2;
                for (int col = 1; col <= Asteriscos; col++) {
                    System.out.print("*");

                }
                for (int col = 1; col <= tamEspaco; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= Asteriscos; col++) {
                    System.out.print("*");
                }
                System.out.println();


            }
    }


 }
}

