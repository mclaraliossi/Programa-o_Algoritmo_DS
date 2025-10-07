package IfElse;

import java.util.Scanner;

public class DesafioContaEnergia {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        double consumo, valortotal;

        System.out.println("Digite quantidade de kWh consumidos: ");
        consumo = ler.nextDouble();

        if(consumo <= 100){
            valortotal = consumo * 0.5;
            System.out.println("O valor total da conta é: " + valortotal);
        }else{
            valortotal = (consumo - 100) * 0.75 + (100 * 0.5)  ;
            System.out.println("O valor total da conta é: " + valortotal);
        }
    }
}
