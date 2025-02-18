package com.agibank;

public class Main {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + somar(3,5));
        System.out.println("Resultado: " + subtraction(3,5));
    }
}
