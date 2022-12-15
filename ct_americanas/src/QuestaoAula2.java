import java.util.Scanner;

/*
1 - Um lojista deseja saber qual o valor da mercadoria ao
aplicar um desconto de 5% sobre o preço de venda.
Para isso deve ser solicitado ao usuário que informe o valor de venda
do produto e aplicado o percentual de desconto proposto
*/
public class QuestaoAula2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double valorMercadoria,valorDesconto,valorComDesconto = 0.0;
        Double porcentagemDesconto = 0.05;
        System.out.println("Digite o valor da mercadoria:");
        valorMercadoria = scanner.nextDouble();
        valorDesconto = valorMercadoria * porcentagemDesconto;
        valorComDesconto = valorMercadoria-valorDesconto;
        System.out.println("O valor do produto com "+porcentagemDesconto*100+"% de desconto é :"+valorComDesconto);
    }
}
