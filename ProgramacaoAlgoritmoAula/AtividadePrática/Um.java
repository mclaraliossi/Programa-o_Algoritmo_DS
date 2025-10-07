package AtividadePrática;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double prod1, prod2, prod3, pdesconto, total, vdesconto, vfinal;

        System.out.println("Digite o valor de cada um dos três produtos que deseja comprar: ");
        prod1 = ler.nextDouble();
        prod2 = ler.nextDouble();
        prod3 = ler.nextDouble();

        System.out.println("Digite o percentual de desconto: ");
        pdesconto = ler.nextDouble();

        total = prod1 + prod2 + prod3;

        vdesconto = (pdesconto / 100) * total;

        vfinal = total - vdesconto;

        System.out.println("O valor total da compra sem desconto é: " + total);
        System.out.println("O valor do desconto é: " + vdesconto);
        System.out.println("O valor final da compra com o desconto aplicado é igual a: " + vfinal);
    }
}
