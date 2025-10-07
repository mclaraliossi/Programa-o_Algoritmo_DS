package Exercicios;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        double km, consumo, litros;

        System.out.println("Qual é a distancia da viagem em quilometros? Qual é o consumo de combustivel?( km por litro)");
        km = ler.nextDouble();
        consumo = ler.nextDouble();

        litros = km / consumo;

        System.out.println("Para percorrer " + km + "km, você precisará de " + litros + " litros de combustível");
        
    }
}

