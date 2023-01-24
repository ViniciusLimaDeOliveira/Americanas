package br.com.americanas.polotech.aula2;

import java.util.Scanner;

/*
você quer vender um notebook e está aceitando pagamento no cartão,
porém existem algumas taxas da maquininha e
você quer saber quanto você irá receber vendendo seu notebook no débito,
no crédito à vista ou no crédito parcelado.
Para isso, crie uma interface:
• O nome da interface deverá ser TaxaMaquininha;
• Deverá ter um único método chamado getValorTaxa(), que não recebe nada e devolve um double.
As taxas são a partir de 0,95% no débito; 0,99% no crédito à vista e de 9,99% no parcelado.
Na classe Main deverá imprimir:
• "Valor cobrado pela venda do Notebook no 'opcaoDePagamentoAqui'
foi 'valorX' e você irá receber 'valorY'"
*/
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valorNote;
        System.out.println("Qual valor da compra ?");
        valorNote = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Qual metodo utizado? Debito - 1,Credito a vista - 2 , Credito Parcelado - 3");
        int op = scanner.nextInt();
        switch (op){
            case 1: valorComTaxa(valorNote,new Debito());
                break;
            case 2: valorComTaxa(valorNote,new AVistaCredito());
                break;
            case 3: valorComTaxa(valorNote,new CreditoParcelado());
                break;
        }



    }
    public static void valorComTaxa(Double valorCompra, TaxaMaquininha metodo){
        System.out.println("Valor cobrado pela venda do Notebook no "+ metodo.getClass().getSimpleName()
                +" foi "+ valorCompra*metodo.getValorTaxa() + " e voçê irá receber "+
                (valorCompra-valorCompra*metodo.getValorTaxa()));
    }
}
