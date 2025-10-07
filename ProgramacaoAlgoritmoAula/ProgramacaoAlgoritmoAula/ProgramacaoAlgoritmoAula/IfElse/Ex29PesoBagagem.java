package IfElse;

import java.util.Scanner;

public class Ex29PesoBagagem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double pesobagagem, valortotal;

        System.out.println("Digite o peso da bagagem: ");
        pesobagagem = ler.nextDouble();

        if(pesobagagem > 20){

            valortotal = (pesobagagem - 20) * 5;
            System.out.println("O valor a ser pago pelo excesso de bagagem será de: " + valortotal + " reais");
        }else{
            System.out.println("O peso da sua bagagem está dentro do limite, não haverá custo adicional!");
        }
    }
}
