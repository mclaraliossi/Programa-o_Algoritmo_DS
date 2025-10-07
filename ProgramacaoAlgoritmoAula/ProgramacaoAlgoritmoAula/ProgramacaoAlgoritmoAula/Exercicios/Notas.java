package Exercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Qual a sua nota em três provas?");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média das suas notas é " + media);

    }
}
