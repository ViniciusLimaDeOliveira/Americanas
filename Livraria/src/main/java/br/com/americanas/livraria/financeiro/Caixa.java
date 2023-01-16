package br.com.americanas.livraria.financeiro;

public class Caixa {
    Double dinheiro;
    public Caixa(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void addDinheiro(Double recebido) {
        this.dinheiro = this.dinheiro+recebido;
    }

    public void rmvDinheiro(Double recebido) {
        this.dinheiro = this.dinheiro-recebido;
    }

    public Double balancoDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
