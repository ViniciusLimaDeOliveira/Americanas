import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Vinicius Lima");
        Double pesoInicial,pesoAtual,difPeso = 0.0;
        int quantidadeMesses=0;
        System.out.println("Digite o peso inicial:");
        pesoInicial = s.nextDouble();
        System.out.println("Digite o peso atual");
        pesoAtual = s.nextDouble();
        System.out.println("Digite a quantidade de meses");
        quantidadeMesses = s.nextInt();
        if(quantidadeMesses>0){
            difPeso = (pesoAtual-pesoInicial);

            if (difPeso==0){
                System.out.println("Voce não ganhou peso !!");
            }else{
                difPeso = difPeso/quantidadeMesses;
                if(difPeso<0){
                    System.out.println("Voce perdeu por mes : "+difPeso);
                }
                if(difPeso>0){
                    System.out.println("Voce ganhou por mes : "+difPeso);
                }
            }
        } else {
            System.out.println("ATENÇÂO : Quantidade de meses invalidas, insira um numero maior que 0 !");
        }
        }
}
