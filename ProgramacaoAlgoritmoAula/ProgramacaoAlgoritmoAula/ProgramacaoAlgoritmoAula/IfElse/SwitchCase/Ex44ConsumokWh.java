package IfElse.SwitchCase;

import java.util.Scanner;

public class Ex44ConsumokWh {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int bandeira;
        double consumo;

        System.out.println("Digite a bandeira tarifaria: \n" + 
        "1 - Verde\n"+
        "2 - Amarela\n"+
        "3 - Vermelha");
        bandeira = ler.nextInt();

        System.out.println("Digite o seu consumo mensal em kWh: ");
        consumo = ler.nextDouble();

        switch (bandeira){
            case 1:
            System.out.println("O total da conta de luz é: " + (consumo));
            break;

            case 2:
            System.out.println("O total da conta de luz é: " + (consumo * 1.1));
            break;

            case 3:
            System.out.println("O total da conta de luz é: " + (consumo * 1.25));
            break;


            default:
            System.out.println("Opção inválida!");
        }

    }
}
// Faça um programa que leia:
// o consumo mensal em kWh
// o tipo de bandeira tarifária:
// 1 - Verde
// 2 - Amarela
// 3 - Vermelha
// O valor base por kWh é de R$ 0,50.
// Dependendo da bandeira, aplique o seguinte acréscimo:
// Bandeira	  Acréscimo por kWh
// Verde	  0%
// Amarela	  +10%
// Vermelha	  +25%
// Calcule e exiba o valor total da conta de luz considerando o acréscimo da bandeira.
