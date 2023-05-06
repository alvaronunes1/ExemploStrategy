package br.newtonpaiva.dominio;

import java.math.BigDecimal;

public class VeiculoCargaHora implements Calcular {

    private Long horas;
    private Integer eixos;
    private BigDecimal valorHora;

    public VeiculoCargaHora(Long horas, Integer eixos, BigDecimal valorHora) {
        this.horas = horas;
        this.eixos = eixos;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal execute() {
        return valorHora.multiply(
                new BigDecimal(eixos).multiply
                        (new BigDecimal(horas)));
    }
}
