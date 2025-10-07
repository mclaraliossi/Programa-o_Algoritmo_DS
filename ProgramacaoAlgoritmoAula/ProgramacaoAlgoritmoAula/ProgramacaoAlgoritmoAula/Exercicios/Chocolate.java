package Exercicios;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
         
        Scanner ler = new Scanner(System.in);

        double quant, preco, total;

        System.out.println("Quantos chocolates foram comprados e qual foi o preço de cada um?");
        quant = ler.nextDouble();
        preco = ler.nextDouble();

        total = quant * preco;

        System.out.println("Você comprou " + quant + " chocolates. Você tem que pagar " + total);
    }
}
