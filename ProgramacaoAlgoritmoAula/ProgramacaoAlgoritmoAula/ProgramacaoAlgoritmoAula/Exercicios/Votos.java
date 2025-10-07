package Exercicios;

import java.util.Scanner;

public class Votos {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        double totalvotos, votosbrancos, votosnulos, votosvalidos, pbrancos, pnulos, pvalidos;

        System.out.println("Informe o total de votos");
        totalvotos = ler.nextDouble();

        System.out.println("Informe a quantidade de votos brancos, votos nulos e votos válidos:");
        votosbrancos = ler.nextDouble();
        votosnulos = ler.nextDouble();
        votosvalidos = ler.nextDouble();

        pbrancos = (votosbrancos * 100) / totalvotos;
        pnulos = (votosnulos * 100) / totalvotos;
        pvalidos = (votosvalidos * 100) / totalvotos;
        

        System.out.println("Votos no total: " + totalvotos);
        System.out.println("Votos em branco: " + pbrancos + "%");
        System.out.println("Votos nulos: " + pnulos + "%");
        System.out.println("Votos válidos: " + pvalidos + "%");
     

    }
}
