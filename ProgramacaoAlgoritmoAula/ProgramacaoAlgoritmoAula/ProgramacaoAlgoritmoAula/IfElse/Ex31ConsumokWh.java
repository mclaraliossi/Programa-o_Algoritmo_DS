package IfElse;

import java.util.Scanner;

public class Ex31ConsumokWh {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        double consumo, valortotal;

        System.out.println("Digite quantidade de kWh consumidos: ");
        consumo = ler.nextDouble();

        if(consumo <= 200){
            valortotal = consumo * 0.2;
            System.out.println("O valor total da conta é: " + valortotal);
        }else{
            valortotal = consumo  * 0.3;
            System.out.println("O valor total da conta é: " + valortotal);
        }
    }
}
