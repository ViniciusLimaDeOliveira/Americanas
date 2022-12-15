/*
2 - A loja "Tudo mais barato" esta fazendo uma liquidação de inverno e para isso deve ser aplicado um desconto de 10% sobre
o valor de venda das calças, 20% sobre o valor das botas e 40% sobre o valor das blusas e também dos cachecóis.
Para isso deve ser solicitado ao usuário que informe o tipo da roupa e também o valor atual.
Com as informações obtidas deve ser calculado qual o novo valor de venda do produto
*/
import java.util.Scanner;
public class Questao2Aula2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double valorMercadoria,valorDesconto,valorComDesconto,porcentagemDesconto = 0.0;
        String TipoMercadoria;
        System.out.println("Qual tipo de mercadoria: (sem acentuação,no plural)");
        TipoMercadoria = scanner.nextLine();
        System.out.println("Digite o valor da mercadoria:");
        valorMercadoria = scanner.nextDouble();

        switch (TipoMercadoria.toLowerCase()){
            case "calças","cauças"-> porcentagemDesconto=0.10;
            case "botas"-> porcentagemDesconto=0.20;
            case "blusas","cachecois"-> porcentagemDesconto=0.40;
            default -> {
                System.out.println("Produto não elegivel a desconto, o preço permanece á :"+valorMercadoria+" Reais");
                System.exit(1);
            }
        };
        valorDesconto = valorMercadoria * porcentagemDesconto;
        valorComDesconto = valorMercadoria-valorDesconto;
        System.out.println("O valor do produto com "+porcentagemDesconto*100+"% de desconto é :"+valorComDesconto+" Reais");
    }
}
