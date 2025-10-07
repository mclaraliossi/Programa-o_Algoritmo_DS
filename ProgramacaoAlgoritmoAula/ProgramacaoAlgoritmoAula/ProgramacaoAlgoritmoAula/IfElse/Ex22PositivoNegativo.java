package IfElse;

import java.util.Scanner;

public class Ex22PositivoNegativo {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = ler.nextInt();

        if(n > 0){
            System.out.println("Esse número é positivo");
        }else{
            System.out.println("Esse número é negativo");
        }
    }
}
