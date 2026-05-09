package org.example.beginner;

import org.example.utils.Decimal;

import java.math.BigDecimal;

public class Circulo {
    private BigDecimal raio;
    private final double PI = 3.14159;

    public Circulo(BigDecimal raio) {
        this.raio = raio;
    }

    public BigDecimal getRaio() {
        return raio;
    }

    public void setRaio(BigDecimal raio) {
        this.raio = raio;
    }

    public String calcularArea() {
        BigDecimal raioQuadrado = Decimal.multiplicarPontoFlutuante(getRaio(), getRaio());
        BigDecimal area = Decimal.multiplicarPontoFlutuante(BigDecimal.valueOf(PI), raioQuadrado);

        String areaFmt = Decimal.formatarCom(Decimal.QUATRO_CASAS, area.doubleValue());

        return String.format("A=%s", areaFmt);
    }
}
