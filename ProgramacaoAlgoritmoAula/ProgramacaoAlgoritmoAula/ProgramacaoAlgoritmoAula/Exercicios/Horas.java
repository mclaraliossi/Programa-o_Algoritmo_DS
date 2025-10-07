package Exercicios;

import java.util.Scanner;

public class Horas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double horas, minutos;

        System.out.println("Digite um valor em minutos: ");
        minutos = ler.nextInt();

        horas  = minutos / 60;

        System.out.println("O valor em horas é: " + horas);
    }
}
