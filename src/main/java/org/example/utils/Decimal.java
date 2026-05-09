package org.example.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Decimal {

    public static final String UMA_CASAS = "0.0000";
    public static final String DUAS_CASAS = "0.0000";
    public static final String TRES_CASAS = "0.0000";
    public static final String QUATRO_CASAS = "0.0000";

    public static String formatarCom(String pattern, double valor) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat(pattern, symbols);
       return df.format(valor);
    }

    public static BigDecimal multiplicarPontoFlutuante(String a, String b) {
        BigDecimal aDecimal = new BigDecimal(a);
        BigDecimal bDecimal = new BigDecimal(b);
        return aDecimal.multiply(bDecimal);
    }

    public static BigDecimal multiplicarPontoFlutuante(Double a, Double b) {
        BigDecimal aDecimal = new BigDecimal(a);
        BigDecimal bDecimal = new BigDecimal(b);
        return aDecimal.multiply(bDecimal);
    }

    public static BigDecimal multiplicarPontoFlutuante(BigDecimal a, BigDecimal b) {
        return a.multiply(b);
    }
}
