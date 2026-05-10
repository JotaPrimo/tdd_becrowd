package org.example;

import org.example.beginner.AverageOne;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String a = leitor.next();
        String b = leitor.next();

        AverageOne averageOne = new AverageOne(a, b);

        System.out.println(averageOne.calculateMedia());
    }
}