package br.ada.americanas.servlet;

import java.math.BigDecimal;

public class SomaOperacao implements Operacao{
    private BigDecimal first;
    private BigDecimal second;
    private BigDecimal result;
    @Override
    public BigDecimal execute(BigDecimal first,BigDecimal second){
        this.first=first;
        this.second=second;
        result=first.add(second);
        return result;
    }

    @Override
    public String simboloMatematico() {
        return "+";
    }

    @Override
    public String toString() {
        return first+" + "+second+" = "+ result;
    }
}
