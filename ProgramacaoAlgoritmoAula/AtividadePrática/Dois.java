package AtividadePrática;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        double largura, comprimento, m2;

        System.out.println("Digite a largura do terreno: ");
        largura = ler.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = ler.nextDouble();

        System.out.println("Digite o preço de metro quadrado: ");
        m2 = ler.nextDouble();

        System.out.println("Largura do terreno: " + largura + "m");
        
        System.out.println("Comprimento do terreno: " + comprimento + "m");

        double area = largura * comprimento;

        System.out.println("Área total do terreno: " + area + "m²");

        System.out.println("Valor do m²: " + df.format(m2));

        double custoterreno = (largura * comprimento) * m2;

        System.out.println("Valor do terreno: " + df.format(custoterreno));

        double imposto = (custoterreno / 100) * 3;

        System.out.println("Valor do imposto(3%) a ser cobrado: " + df.format(imposto));
    }
}
