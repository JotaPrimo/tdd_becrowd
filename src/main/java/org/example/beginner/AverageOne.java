package org.example.beginner;

import org.example.utils.Decimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageOne {
    private static final BigDecimal PESO_A = new BigDecimal("3.5");
    private static final BigDecimal PESO_B = new BigDecimal("7.5");

    private String a;
    private String b;

    public AverageOne(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public  BigDecimal processA() {
        return Decimal.multiplicarPontoFlutuante(new BigDecimal(getA()), PESO_A);
    }

    public  BigDecimal processB() {
        return Decimal.multiplicarPontoFlutuante(new BigDecimal(getB()), PESO_B);
    }

    public String calculateMedia() {
        BigDecimal soma = processA().add(processB());
        BigDecimal somaPesos = PESO_A.add(PESO_B);
        BigDecimal media = soma.divide(somaPesos, 5, RoundingMode.HALF_UP);

        return String.format("MEDIA = %s", Decimal.formatarCom(Decimal.CINCO_CASAS, media));
    }
}
