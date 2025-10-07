package IfElse;

import java.util.Scanner;

public class Ex30Vendas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double meta, valorvendido, bonus;

        System.out.println("Digite o valor da meta de vendas: ");
        meta = ler.nextDouble();

        System.out.println("Digite o valor realmente vendido: ");
        valorvendido = ler.nextDouble();

        if(valorvendido >= meta){
            
            bonus = valorvendido * 1.1;
            System.out.println("O valor do seu salário com o bônus é: " + bonus);
        }else{
            bonus = valorvendido * 1.03;
            System.out.println("O valor do seu salário com o bônus é: " + bonus);
        }
    }
}
