
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploScanner {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int n1,n2,soma;

        

        System.out.println("Digite dois números inteiros: ");
        n1 = ler.nextInt();
        n2 = ler.nextInt();

        soma = n1 + n2;

        System.out.println("A soma dos números é: " +soma);

      

       
    }
}
