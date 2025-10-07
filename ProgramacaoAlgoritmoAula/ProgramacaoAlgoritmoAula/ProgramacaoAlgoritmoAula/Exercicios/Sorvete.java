package Exercicios;

import java.util.Scanner;

public class Sorvete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int bolas;
        double preco, total;

        System.out.println("Quantas bolas de sorvete vai querer? Qual o preço de cada uma?");
        bolas = ler.nextInt();
        preco = ler.nextDouble();

        total = bolas * preco;

        System.out.println("O total da compra será " + total + " reais");
    }
}
