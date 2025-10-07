package IfElse;

import java.util.Scanner;

public class Ex28HorasTrabalhadas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double horasextras, valorhora;

        System.out.println("Digite quantas horas extras você trabalhou: ");
        horasextras = ler.nextDouble();

        System.out.println("Qual o valor da hora normal?");
        valorhora = ler.nextDouble();

        if(horasextras > 10){
            double vhoraextras = (valorhora / 2) * horasextras; 
            System.out.println("O total que recebido pelas horas extras será de: " + vhoraextras + " reais");
        }else{
            double vhoraextras = (valorhora / 4) * horasextras; 
            System.out.println("O total que recebido pelas horas extras será de: " + vhoraextras + " reais"); 
        }

    }

}
