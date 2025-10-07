package Exercicios;

import java.util.Scanner;

public class MediaPonderadaNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;

        System.out.println("Informe 3 notas suas:");
        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();
        nota3 = ler.nextDouble();

        media = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;

        System.out.println("A sua média ponderada é igual a " + media);

    }
}
