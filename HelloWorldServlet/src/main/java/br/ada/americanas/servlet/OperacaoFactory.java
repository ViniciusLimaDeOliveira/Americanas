package br.ada.americanas.servlet;

public class OperacaoFactory {
    public static Operacao create(String simboloMatematico) {
        Operacao operacao;
        switch (simboloMatematico) {
            case "+":
                operacao = new SomaOperacao();
                break;
            case "-":
                operacao = new SubOperacao();
                break;
            case "*":
                operacao = new MultOperacao();
                break;
            case "/":
                operacao = new DivOperacao();
                break;
            default:
                throw new RuntimeException("Operacao não permitida");
        };
        return operacao;
    }
}
