package IfElse;

import java.util.Scanner;

public class Ex38Curso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double curso, media;

        System.out.println("Digite o seu curso onde 1 - Informática e 2 - Administração ");
        curso = ler.nextDouble();

        System.out.println("Digite a média final do aluno ");
        media = ler.nextDouble();

        if (curso == 1) {
            if (media >= 7) {
                System.out.println("Parabens você foi aprovado! Sua media foi: " + media);
            } else {
                System.out.println("Que pena, você foi reprovado! Sua media foi: " + media);
            }
        } else {
           if (media >= 6) {
            System.out.println("Parabens você foi aprovado! Sua media foi: " + media);
        } else {
            System.out.println("Que pena, você foi reprovado! Sua media foi: " + media);
        } 
        }
       
    }
}
