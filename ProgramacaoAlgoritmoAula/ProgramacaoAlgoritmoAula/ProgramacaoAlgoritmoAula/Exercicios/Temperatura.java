package Exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double c, f;

        System.out.println("Quantos graus celsius está fazendo?");
        c = ler.nextDouble();

        f = c * 9/5 + 32;

        System.out.println("A temperatura convertida para Fahrenheit é igual a " + f + " graus");


    }
}
