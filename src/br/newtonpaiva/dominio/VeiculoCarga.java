package br.newtonpaiva.dominio;

public class VeiculoCarga extends Veiculo {
    private Integer eixos;

    public VeiculoCarga(String placa, Integer eixos) {
        super(placa);
        this.eixos = eixos;
    }


}
