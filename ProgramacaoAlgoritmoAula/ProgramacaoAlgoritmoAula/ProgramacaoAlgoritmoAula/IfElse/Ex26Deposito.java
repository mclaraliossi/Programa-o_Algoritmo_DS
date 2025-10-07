package IfElse;

import java.util.Scanner;

public class Ex26Deposito {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double poupanca, valorfinal;

        System.out.println("Digite o valor do depósito na poupança: ");
        poupanca = ler.nextInt();

        if(poupanca > 1000){

            valorfinal = poupanca * 1.03;
            System.out.println("O valor final do deósito será: " + valorfinal);
        }else{

            valorfinal = poupanca * 1.015;
            System.out.println("O valor final do deósito será: " + valorfinal);

        }
    }
}
