package IfElse;

import java.util.Scanner;

public class Ex24Maior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1, n2;

        System.out.println("Digite dois números: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();

        if(n1 > n2){
            System.out.println("O maior número é " + n1);
        }else{
            System.out.println("O maior número é " + n2);
        }
    }
}
