package Exercicios;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salariobruto, salarioliquido, pbonus, pdescontoinss, bonus, descontoinss;

        System.out.println("Informe o seu sálario bruto, o percentual de bônus e o percentual de desconto do INSS");
        salariobruto = ler.nextDouble();
        pbonus = ler.nextDouble();
        pdescontoinss = ler.nextDouble();

        bonus = (pbonus / 100) * salariobruto;
        descontoinss = (pdescontoinss / 100) * salariobruto;
        salarioliquido = salariobruto + bonus - descontoinss;

        System.out.println("Salario bruto: " + salariobruto);
        System.out.println("Bônus: " + bonus);
        System.out.println("Desconto INSS: " + descontoinss);
        System.out.println("Sálario liquido: " + salarioliquido);


    }
}
