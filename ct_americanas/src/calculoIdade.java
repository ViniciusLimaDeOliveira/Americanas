import java.time.LocalDate;
import java.util.Scanner;
public class calculoIdade {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vinicius Lima");
        int anoNascimento,anoAtual,idade = 0;
        boolean continua=true;
        while (continua){
        System.out.println("Digite o ano de nascimento:");
        anoNascimento = scanner.nextInt();
        anoAtual = LocalDate.now().getYear();
        idade = anoAtual - anoNascimento;
        System.out.println("Voce tem "+idade+" anos de idade.");
        System.out.println("Continuar executando (s/n)?");
        String escolha =scanner.next();
        if(escolha.equals("n")){
            continua=false;
            }
        }
    }
}