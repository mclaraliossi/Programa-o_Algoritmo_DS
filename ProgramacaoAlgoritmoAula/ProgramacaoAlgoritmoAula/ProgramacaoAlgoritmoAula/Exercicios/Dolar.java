package Exercicios;

import java.util.Scanner;

public class Dolar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double dolar, real, dolcomprados;

        System.out.println("Quantos reais você tem? Qual a cotação do dolar?");
        real = ler.nextDouble();
        dolar = ler.nextDouble();

        dolcomprados = real / dolar;

        System.out.println("Você pode comprar " + dolcomprados + " dolares");

    }
}
