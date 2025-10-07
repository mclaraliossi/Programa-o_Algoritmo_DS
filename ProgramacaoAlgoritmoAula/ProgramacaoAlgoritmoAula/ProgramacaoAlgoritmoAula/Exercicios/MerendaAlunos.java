package Exercicios;

import java.util.Scanner;

public class MerendaAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int alunos, paes, sobra;

        System.out.println("Quantos alunos tem na sala? Quantos pães foram comprados?");
        alunos = ler.nextInt();
        paes = ler.nextInt();

        sobra = paes - alunos;

        System.out.println("Sabendo que cada aluno receberá 1 pão, a quantidade de pães que sobrou foi " + sobra);
    }
}
