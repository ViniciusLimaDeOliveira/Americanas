/*
1 - A Sra. Maria deve 10 mil reais para o banco 'Seu dinheiro é nossa alegria', à uma taxa de juro de 0,99% ao mês.
 Após ter juntado o equivalente a R$ 2.398,00 ela decidiu aplicar em um investimento de juros compostos, esse com
 taxa de 1,3% ao mês. Escreva um algoritmo de calcule a quantidade de meses que será necessário até que o investimento
 pague a dívida.
          Neste caso é direto mesmo, sem input de usuário nem nada, apenas o algoritmo com laços para calcular a
          quantidade de meses.
* */
public class Q1Aula3 {
    public static void main(String[] args){
        double divida = 10000;
        final double jurosBanco=0.99;
        final double jurosInvestimento=1.3;
        double valorInvestimento=2398;
        int quantidadeMeses=0;
        while (divida>=valorInvestimento){
            valorInvestimento = valorInvestimento+((jurosInvestimento*valorInvestimento)/100);
            divida = divida+((jurosBanco*divida)/100);
            quantidadeMeses+=1;
        }
        System.out.println("Sra. Maria pagou sua divida em : "+quantidadeMeses);
        System.out.println("Sua divida estava em "+divida+" \n|E seu investimento estava em "+valorInvestimento);
    }


}
