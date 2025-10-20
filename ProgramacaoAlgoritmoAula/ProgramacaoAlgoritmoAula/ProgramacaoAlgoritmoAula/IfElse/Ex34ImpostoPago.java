package IfElse;

import java.util.Scanner;

public class Ex34ImpostoPago {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Digite o seu salario mensal:");
        salario=ler.nextDouble();

        if (salario > 4000) {
            imposto = salario * 0.2;
            System.out.println("O imposto a ser pago é: " + imposto);
        } else if (salario > 2000 && salario < 4000){
            imposto = salario * 0.1;
            System.out.println("O imposto a ser pago é: " + imposto);
        }else{
            System.out.println("Você não tem imposto a pagar.");
        }
    }
    
}
