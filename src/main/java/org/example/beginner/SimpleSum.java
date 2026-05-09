package org.example.beginner;

public class SimpleSum {

    private int a;
    private int b;

    public SimpleSum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String calculateSum() {
        return String.format("SOMA = %d", (getA() + getB()));
    }
}
