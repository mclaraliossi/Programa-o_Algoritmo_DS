package IfElse;

import java.util.Scanner;

public class Ex37Veiculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double tipo, distancia, tarifa;

        System.out.println("Digite o seu tipo de veículo (1 - Carro / 2 - Moto)");
        tipo=ler.nextDouble();

        System.out.println("Digite a distancia percorrida em km: ");
        distancia=ler.nextDouble();
        
        if (tipo == 1) {
            if (distancia <= 100) {
                tarifa = distancia * 2.5;
                System.out.println("A tarifa é: " + tarifa);
            } else {
                tarifa = distancia * 2.0;
                System.out.println("A tarifa é: " + tarifa);
            }
        } else {
            if (distancia <= 100) {
                tarifa = distancia * 1.5;
                System.out.println("A tarifa é: " + tarifa);
            } else {
                tarifa = distancia * 1.2;
                System.out.println("A tarifa é: " + tarifa);
            }
        }
    }
}
