package br.com.americanas.polotech.aula2;

public class CreditoParcelado implements TaxaMaquininha{
    private final Double VALOR_TAXA = 0.0999;

    @Override
    public  double getValorTaxa() {
        return VALOR_TAXA;
    }
}
