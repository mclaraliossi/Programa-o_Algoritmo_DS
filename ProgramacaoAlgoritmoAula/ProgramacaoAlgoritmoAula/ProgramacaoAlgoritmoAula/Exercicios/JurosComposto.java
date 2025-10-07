package Exercicios;

import java.util.Scanner;

public class JurosComposto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double valorfinanciamento, taxa, meses, prestacao;

        System.out.println(
                "Informe o valor do financiamento, a taxa de juros ao mês, e a quantidade de meses para pagar:");
        valorfinanciamento = ler.nextDouble();
        taxa = ler.nextDouble();
        meses = ler.nextDouble();
        double i = taxa / 100;
        prestacao = ((i * (Math.pow((i + 1), meses))) / ((Math.pow((i + 1), meses)) - 1)) * valorfinanciamento;

        System.out.println("A prestação será de: " + prestacao);

    }
}

/*
 * Faça um programa que deverá pedir ao usuário os seguintes dados:
 * Valor do financiamento (em R$)
 * Taxa de juros ao mês (%)
 * Quantidade de meses para pagar
 * O programa deve calcular o valor da prestação mensal usando a fórmula da
 * Tabela Price:
 * 
 * 
 * Onde:
 * Valor = valor financiado
 * i = taxa de juros ao mês (em decimal → dividir a % por 100)
 * n = quantidade de meses
 * Exemplo:
 * Valor do financiamento: R$ 10.000,00
 * Taxa de juros: 2% ao mês
 * Prazo: 12 meses
 * Prestação fixa: R$ 943,00
 */
