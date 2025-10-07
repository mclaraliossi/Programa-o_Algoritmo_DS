package IfElse;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double nota1, nota2;

        System.out.println("Digite suas duas notas: ");
        nota1 = ler.nextInt();
        nota2 = ler.nextInt();

        if((nota1 + nota2)/2 >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
