import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        JOptionPane.showMessageDialog(null, "Sua média ponderada é: " + (((n1 * 2) + (n2 * 3) + (n3 * 5))/ 10));
    }
}
/*Média ponderada*/