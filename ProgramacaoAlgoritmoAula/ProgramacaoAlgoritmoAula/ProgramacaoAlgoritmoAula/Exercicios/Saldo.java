package Exercicios;

import java.util.Scanner;

public class Saldo {
     public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double saldoinicial, saque, saldofinal;

        System.out.println("Quanto de dinheiro você tem no banco?");
        saldoinicial = ler.nextDouble();

        System.out.println("Quanto você quer sacar?");
        saque = ler.nextDouble();

        saldofinal = saldoinicial - saque;

        System.out.println("Você tinha " + saldoinicial + ", sacou "+ saque + " e sobrou " + saldofinal);
     }
}
