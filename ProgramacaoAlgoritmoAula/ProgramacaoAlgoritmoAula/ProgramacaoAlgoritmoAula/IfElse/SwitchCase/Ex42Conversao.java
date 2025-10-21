package IfElse.SwitchCase;

import java.util.Scanner;

public class Ex42Conversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int codigoconv;
        double metros;

        System.out.println("Digite um valor em metros: ");
        metros = ler.nextDouble();

        System.out.println("Digite para qual unidade de medida deseja fazer a conversão: \n"+ 
        "1 - Converter para centímetros \n" +
        "2 - Converter para milímetros\n" + 
        "3 - Converter para quilômetros");
        codigoconv = ler.nextInt();

        switch (codigoconv){
            case 1:
            System.out.println("O total é: " + (metros * 100));
            break;

            case 2:
            System.out.println("O total é: " + (metros * 1000));
            break;

            case 3:
            System.out.println("O total é: " + (metros / 1000));
            break;


            default:
            System.out.println("Opção inválida!");
        }



    }
}
//         Faça um programa que leia um valor em metros e um código de conversão:
// 1 - Converter para centímetros
// 2 - Converter para milímetros
// 3 - Converter para quilômetros
// Use switch...case para efetuar a conversão e exibir o resultado. Se o código for inválido, exibir "Opção inválida".
