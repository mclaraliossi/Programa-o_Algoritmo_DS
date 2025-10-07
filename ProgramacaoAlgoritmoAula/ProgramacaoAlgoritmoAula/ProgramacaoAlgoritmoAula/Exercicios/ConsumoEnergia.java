package Exercicios;

import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double consumo, valorkWh, valorenergia, taxailuminação, valorfinal;

        System.out.println("Informe o seu consumo de kWh mensal e o valor do kWh");
        consumo = ler.nextDouble();
        valorkWh = ler.nextDouble();

        valorenergia = consumo * valorkWh;
        taxailuminação = (valorenergia / 100) * 5;
        valorfinal = valorenergia + taxailuminação;

        System.out.println("Consumo: " + consumo);
        System.out.println("Valor da energia: " + valorenergia);
        System.out.println("Taxa de iluminação: " + taxailuminação);
        System.out.println("Valor Final: " + valorfinal);
    }
}
