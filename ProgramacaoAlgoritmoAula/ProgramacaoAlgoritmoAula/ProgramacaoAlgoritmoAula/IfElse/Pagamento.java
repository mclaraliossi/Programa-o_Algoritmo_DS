package IfElse;

import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double totalcompra, formapag,  valorfinal;

        System.out.println("Informe o valor total da compra: ");
        totalcompra = ler.nextDouble();

        System.out.println("Qual a forma de pagamento? Digite 1 para cartão e 2 para pix");
        formapag = ler.nextDouble();

        if(formapag == 1){
            valorfinal = totalcompra * 1.05;
            System.out.println("O valor final da compra será: " + valorfinal);
        }else{
            valorfinal = totalcompra * 0.95;
            System.out.println("O valor final da compra será: " + valorfinal);
        }
    }
}
