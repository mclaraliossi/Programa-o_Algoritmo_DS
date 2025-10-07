package Exercicios;

import java.util.Scanner;

public class Juros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double taxa, emprestimo, meses;

        System.out.println("Qual o valor do empréstimo? Qual a taxa de juros? Por quantos meses?");
        emprestimo = ler.nextDouble();
        taxa = ler.nextDouble();
        meses = ler.nextDouble();

        System.out.println("O valor total de juros é: " + (emprestimo * taxa * meses) / 100 + "\n" + 
        "O valor total a ser pago é: " + (((emprestimo * taxa * meses) / 100) + emprestimo));
    }
}
