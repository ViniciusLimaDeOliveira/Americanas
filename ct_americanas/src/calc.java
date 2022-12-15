//Criar uma calculadora que faça as 4 oerações básicas (soma, subtração, divisão e multiplicação).
// As informações para essa calculadora devem ser obtidas através do input do usuário, utilizando o scanner,
// deve ser solicitado 2 número reais e uma operação a ser executada.
import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double operando1,operando2,resultado=0.0;
        String operacao;
        System.out.println("Digite um numero: ");
        operando1 = scanner.nextDouble();
        System.out.println("Digite simbolo da operação: + soma | - subtração | * multiplicação | / divisão ");
        operacao = scanner.next();
        System.out.println("Digite segundo numero: ");
        operando2 = scanner.nextDouble();
        switch (operacao){
            case "+":
                resultado=operando1+operando2;
                break;
            case "-":
                resultado=operando1-operando2;
                break;
            case "*":
                resultado=operando1*operando2;
                break;
            case "/":
                if(operando2!=0){
                    resultado=operando1/operando2;
                }
                break;
            default:{
                System.out.println("Operador invalido!");
                System.exit(1);
            }
        }
        if(operando2==0.0){
            System.out.println("Divisão por 0 !");
        }else if (operacao.equals("*")||operacao.equals("-")||operacao.equals("+")||operacao.equals("/"))
            System.out.println("Resultado : "+operando1+" "+operacao+" "+operando2+" = "+resultado);
    }
}
/*outro modo de case swicth




*/