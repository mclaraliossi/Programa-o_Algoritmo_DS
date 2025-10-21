package IfElse.SwitchCase;

import java.util.Scanner;

public class Ex41Cardapio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int produto, quantidade;
        double total;

        System.out.println("Código	      Produto        Preço \n  " + 
        " 1	 Cachorro-quente  R$ 10.00 \n" + 
        " 2	 X-Salada	      R$ 15.00 \n" + 
        " 3	 X-Bacon	      R$ 18.00 \n" +
        " 4	 Refrigerante	  R$ 8.00  \n" +
        " 5	 Suco	          R$ 7.00");

        System.out.println("Digite o código do produto que deseja: ");
        produto = ler.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = ler.nextInt();

        switch (produto){
            case 1:
            System.out.println("O total é: " + (quantidade * 10.00));
            break;

            case 2:
            System.out.println("O total é: " + (quantidade * 15.00));
            break;

            case 3:
            System.out.println("O total é: " + (quantidade * 18.00));
            break;

            case 4:
            System.out.println("O total é: " + (quantidade * 8.00));
            break;

            case 5:
            System.out.println("O total é: " + (quantidade * 7.00));
            break;

            default:
            System.out.println("Produto Inexistente!");
        }



    }
}
//         Faça um programa que mostre o seguinte cardápio:
// Código	Produto	       Preço
// 1	 Cachorro-quente  R$ 10.00
// 2	 X-Salada	      R$ 15.00
// 3	 X-Bacon	      R$ 18.00
// 4	 Refrigerante	  R$ 8.00
// 5	 Suco	          R$ 7.00
// O usuário deve digitar o código do produto e a quantidade. O programa deve calcular e exibir o valor total a pagar. 
// Se o código for inválido, exibir "Produto inexistente".
