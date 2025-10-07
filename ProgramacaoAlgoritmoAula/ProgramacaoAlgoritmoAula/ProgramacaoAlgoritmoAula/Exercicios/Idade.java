package Exercicios;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade, soma;
        final int anos = 10;
        String nome;

        System.out.println("Digite seu nome e sua idade");
        nome = ler.nextLine();
        idade = ler.nextInt();

        soma = idade + anos;

        System.out.println("Olá, " + nome +  " daqui a 10 anos você terá " + soma );
    }
}
