package IfElse.SwitchCase;

import java.util.Scanner;

public class Ex43Transporte {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tipo;
        double distancia;

        System.out.println("Digite qual o tipo de transporte:\n" + 
        "1 - Ônibus\n" + 
        "2 - Trem\n" + 
        "3 - Avião");
        tipo = ler.nextInt();

        System.out.println("Digite a distância: ");
        distancia = ler.nextDouble();
        
        switch (tipo){
            case 1:
            if(distancia <= 500){
            System.out.println("O valor da passagem é: " + (distancia * 0.50));
            }else{
                System.out.println("O valor da passagem é: " + (distancia * 0.45));
            }
            break;

            case 2:
            if(distancia <= 500){
                System.out.println("O valor da passagem é: " + (distancia * 0.40));
                }else{
                    System.out.println("O valor  da passagem é: " + (distancia * 0.35));
                }
            break;

            case 3:
            if(distancia <= 500){
                System.out.println("O valor da passagem é: " + (distancia * 1.0));
                }else{
                    System.out.println("O valor da passagem é: " + (distancia * 0.80));
                }
            break;


            default:
            System.out.println("Tipo de transporte inexistente!");
        }


    }
}
// Faça um programa que leia:
// o tipo de transporte:
// 1 - Ônibus
// 2 - Trem
// 3 - Avião

// a distância da viagem (em km)

// Com base no tipo de transporte, calcule o valor total da passagem usando as tarifas abaixo:
// Tipo de Transporte	Tarifa até 500 km	Tarifa acima de 500 km
// 1 - Ônibus	         R$ 0,50/km	            R$ 0,45/km
// 2 - Trem	             R$ 0,40/km	            R$ 0,35/km
// 3 - Avião	         R$ 1,00/km	            R$ 0,80/km

// Use switch... case para tratar o tipo de transporte e aplique a tarifa adequada conforme a distância. 
// O programa deve imprimir o valor total da passagem. Se o tipo for inválido, exiba “Tipo de transporte inexistente”.
