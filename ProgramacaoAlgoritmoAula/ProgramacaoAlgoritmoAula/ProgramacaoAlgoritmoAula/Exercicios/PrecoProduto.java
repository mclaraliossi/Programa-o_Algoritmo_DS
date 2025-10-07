package Exercicios;

import java.util.Scanner;

public class PrecoProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double ipi, icms, precoinicial, precofinal;

        System.out.println("Informe o valor do produto");
        precoinicial = ler.nextDouble();

        icms =  (precoinicial / 100) * 18;
        ipi =  (precoinicial / 100) * 4;
        precofinal = precoinicial + icms + ipi;

        System.out.println("O valor final do produto é " + precofinal);
    }
}
