package org.example;

import org.example.beginner.SimpleSum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        String SOMA = new SimpleSum(a, b).calculateSum();

        System.out.println(SOMA);
    }
}