package IfElse;

import java.util.Scanner;

public class Ex36IMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double sexo, peso, altura, imc;

        System.out.println("Digite o seu sexo. Digite 1 - Masculino e 2 - Feminino");
        sexo = ler.nextDouble();

        System.out.println("Digite o seu peso:");
        peso=ler.nextDouble();

        System.out.println("Digite a sua altura:");
        altura=ler.nextDouble();

        imc = peso / Math.pow(altura, 2);
        System.out.println("O seu imc é: " + imc);

        if (sexo == 2) {
            if (imc > 24 ) {
                System.out.println("Você está acima do peso ideal");
            } else {
                System.out.println("Você está com peso normal ");
            }
        } else {
            if (imc > 25 ) {
                System.out.println("Você está acima do peso ideal");
            } else {
                System.out.println("Você está com peso normal ");
            }
        }
    }
}
