package Exercicios;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double vproduto, vdesconto, vfinal;

        System.out.println("Qual o valor do produto comprado?Qual a procentagem do desconto");
        vproduto = ler.nextDouble();
        vdesconto = ler.nextDouble();

        double desconto = (vdesconto / 100) * vproduto;
        vfinal = vproduto - desconto;


        System.out.println("O valor inicial do produto era " + vproduto + ", teve " + vdesconto + "% de desconto. O valor final é " + vfinal);
    }
}
