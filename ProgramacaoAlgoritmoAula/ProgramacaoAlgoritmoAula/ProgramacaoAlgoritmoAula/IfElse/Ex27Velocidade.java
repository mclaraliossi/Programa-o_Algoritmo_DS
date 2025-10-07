package IfElse;

import java.util.Scanner;

public class Ex27Velocidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double velocidade, multa;

        System.out.println("Qual a velocidade em que o carro está?");
        velocidade = ler.nextDouble();

        if(velocidade > 100){

            multa = (velocidade - 100) * 57;
            System.out.println("Você ultrapassou o limite de velocidade! Sua multa é de " + multa + " reais");
        }else{
            System.out.println("Você está dentro do limite de velocidade!");
        }


    }
}
