package IfElse;

import java.util.Scanner;

public class Ex32Compra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double compra, frete, valorfinal;

        System.out.println("Digite o valor da compra: ");
        compra = ler.nextDouble();

        System.out.println("digite o valor do frete: ");
        frete = ler.nextDouble();

        if(compra <= 500){

            valorfinal = compra + frete;
            System.out.println("O valor final da compra é: " + valorfinal);
        }else{
            valorfinal = compra + (frete / 2);
            System.out.println("O valor final da compra é: " + valorfinal);
        }
    }
}
