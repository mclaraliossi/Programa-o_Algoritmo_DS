package IfElse;

import java.util.Scanner;

public class Ex33Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1, n2 , media;

        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextDouble();

        media = (n1 + n2) / 2;

        if(media >= 7){
            System.out.println("Você está aprovado! Sua média é: " + media);
        }else if(media <= 7 || media >=5){
            System.out.println("Você está de recuperação! Sua média é: " + media);
        }else{
            System.out.println("Você está reprovado! Sua média é: " + media);
        }

        // 33 - Faça um programa onde o usuário entra com duas notas (N1 e N2) de um aluno. 
        // O programa deve calcular a média e aplicar as seguintes regras: Se a média for maior ou igual a 7, 
        // o aluno está Aprovado. Se a média for menor que 7, mas maior ou igual a 5, o aluno está em Recuperação. 
        // Caso contrário, o aluno está Reprovado. O programa deve imprimir a média e a situação final do aluno.
    }
}
