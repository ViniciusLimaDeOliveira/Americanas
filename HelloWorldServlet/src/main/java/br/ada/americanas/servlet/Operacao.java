package br.ada.americanas.servlet;

import java.math.BigDecimal;

public interface Operacao {
    public BigDecimal execute(BigDecimal first,BigDecimal second);
    String simboloMatematico();
}
