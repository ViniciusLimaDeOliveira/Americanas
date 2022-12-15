import java.util.Scanner;

public class piramide {

    public static void main(String[] args) {
        // *
        // **
        // ***
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a altura da piramide");
        int altura = scanner.nextInt();

        for (int linha = 0; linha < altura; linha++) {
            int quantidadeAsteristico = linha + 1;
            for (int posicao = 0; posicao < quantidadeAsteristico; posicao++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}