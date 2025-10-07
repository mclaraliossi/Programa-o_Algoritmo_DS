package Exercicios;

import java.util.Scanner;

public class Gorjeta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         
        double vconta, pgorjeta, total;

        System.out.println("Qual o valor da conta do restaurante? Qual a porcentagem da gorjeta que você deu?");
        vconta = ler.nextDouble();
        pgorjeta = ler.nextDouble();

        double valorgorjeta = (pgorjeta / 100) * vconta;
        total = valorgorjeta + vconta;

        System.out.println("O total da conta é " + total);
         
    }
}
