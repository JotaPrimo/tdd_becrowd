package org.example;

import org.example.beginner.ExtremelyBasic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        String x = new ExtremelyBasic(a, b).calcularSoma();
        System.out.print(x);
    }
}