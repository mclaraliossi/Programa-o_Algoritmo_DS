package Exercicios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println("Informe seu peso e depois sua altura: ");
        peso = ler.nextDouble();
        altura = ler.nextDouble();

        imc = (altura * altura) / peso;

        System.out.println("Seu IMC é: " + imc);




    }
}
