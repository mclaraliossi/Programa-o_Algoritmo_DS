package Exercicios;

import java.util.Scanner;

public class ContaRestaurante {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorfinal, pessoa, conta, taxaservico;

        System.out.println(
                "Infome qual o valor da conta do restaurante, quantas pessoas estão na mesa e qual o valor da taxa de serviço:");
        conta = ler.nextDouble();
        pessoa = ler.nextDouble();
        taxaservico = ler.nextDouble();

        valorfinal = ((conta / 100) * taxaservico) + conta;

        System.out.println("Valor da conta: " + conta + "\n" +
                "Taxa de serviço(" + taxaservico + "): " + (conta / 100) * taxaservico + "\n" +
                "Valor total: " + valorfinal + "\n" +
                "Valor por pessoa: " + valorfinal / pessoa);

    }
}
