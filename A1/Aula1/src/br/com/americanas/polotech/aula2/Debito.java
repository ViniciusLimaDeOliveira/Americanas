package br.com.americanas.polotech.aula2;

public class Debito implements TaxaMaquininha{

    private final Double VALOR_TAXA = 0.0095;

    @Override
    public  double getValorTaxa() {
        return VALOR_TAXA;
    }
}
