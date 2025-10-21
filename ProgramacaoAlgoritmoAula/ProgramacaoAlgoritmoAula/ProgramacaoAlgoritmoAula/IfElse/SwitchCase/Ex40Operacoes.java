package IfElse.SwitchCase;

import java.util.Scanner;

public class Ex40Operacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1, n2;
        int operacao;

        System.out.println("Digite um número: ");
        n1 = ler.nextDouble();

        System.out.println("Digite outro número: ");
        n2 = ler.nextDouble();

        System.out.println("Escolha uma operação:\n 1 para soma \n 2 para subtração \n 3 para multiplicação \n 4 para divisão");
        operacao = ler.nextInt();

        switch (operacao) {
            case 1:
            System.out.println("O resultado é: " + (n1 + n2));
            break;

            case 2:
            System.out.println("O resultado é: " + (n1 - n2));
            break;

            case 3:
            System.out.println("O resultado é: " + (n1 * n2));
            break;

            case 4:
            System.out.println("O resultado é: " + (n1 / n2));
            break;

            default:
            System.out.println("Resposta inválida!");
        }





    // Faça um programa que leia dois números reais e um código de operação:
    // 1 - Soma
    // 2 - Subtração
    // 3 - Multiplicação
    // 4 - Divisão
    // Use switch...case para realizar a operação correspondente e exibir o resultado. Se o código for diferente de 1 a 4, exiba "Operação inválida".
    }
}
