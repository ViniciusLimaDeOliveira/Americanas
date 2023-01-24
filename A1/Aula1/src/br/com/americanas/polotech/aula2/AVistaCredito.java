package br.com.americanas.polotech.aula2;

public class AVistaCredito implements TaxaMaquininha{
    private final Double VALOR_TAXA = 0.0099;

    @Override
    public double getValorTaxa() {
        return VALOR_TAXA;
    }
}
