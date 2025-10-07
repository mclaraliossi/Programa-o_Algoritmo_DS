package Exercicios;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a largura da caixa");
        double largura = ler.nextDouble();

        System.out.println("Digite a altura da caixa");
        double altura = ler.nextDouble();

        System.out.println("Digite o comprimento da caixa");
        double comprimento = ler.nextDouble();

        System.out.println("Digite também o valor do frete por metro cúbico");
        double frete = ler.nextDouble();

        System.out.println("Largura: " + largura + " m");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Comprimento: " + comprimento + " m");
        System.out.println("Volume da caixa: " + (largura * altura * comprimento) + " m³");
        System.out.println("Valor do frete (R$ " + frete + " por m³): " + (frete * (largura * altura * comprimento)) );
        System.out.println("Seguro (2%):R$ " + ((frete * (largura * altura * comprimento))/100 * 2));
        System.out.println("Valor total do frete: R$ " + (((frete * (largura * altura * comprimento))/100 * 2)+(frete * (largura * altura * comprimento))));

    }
}
