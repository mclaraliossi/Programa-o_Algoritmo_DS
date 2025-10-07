import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);

         double base, altura;
         double area;

         System.out.println("Digite a base e a altura do triângulo: ");
         base = ler.nextInt();
         altura = ler.nextInt();

         area= (base*altura) / 2;

         System.out.println("A área do triangulo é: " + area);
    }
}
