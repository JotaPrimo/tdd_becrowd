package org.example;

import org.example.beginner.Circulo;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        BigDecimal raio = BigDecimal.valueOf(leitor.nextDouble());

        System.out.println(new Circulo(raio).calcularArea());
    }
}