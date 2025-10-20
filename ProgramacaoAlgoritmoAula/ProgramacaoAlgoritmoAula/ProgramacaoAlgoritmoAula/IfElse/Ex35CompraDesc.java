package IfElse;

import java.util.Scanner;

public class Ex35CompraDesc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double compra, desconto;

        System.out.println("Digite o valor todal da compra ");
        compra=ler.nextDouble();

        if (compra > 1000) {
            desconto = compra - (compra * 0.2);
            System.out.println("O seu desconto foi: 20%. Sua compra ficou: " + desconto);
        } else if(compra > 500 && compra < 1000 ){
            desconto = compra - (compra * 0.15);
            System.out.println("O seu desconto foi: 15%. Sua compra ficou: " + desconto);
        }else if(compra > 100 && compra < 500){
            desconto = compra - (compra * 0.1);
            System.out.println("O seu desconto foi: 10%. Sua compra ficou: " + desconto);
        }else{
            System.out.println("Sua compra não teve nenhum desconto");
        }
    }
}
