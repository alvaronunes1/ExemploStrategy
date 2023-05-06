package br.newtonpaiva.dominio;

import java.math.BigDecimal;

public class CalcularVeiculoHoras implements Calcular {

    private Long horas;
    private BigDecimal valorHora;

    public CalcularVeiculoHoras(Long horas, BigDecimal valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal execute() {
        return valorHora.multiply(new BigDecimal(horas));
    }
}
