import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor que deseja sacar: ");
        int valor = scanner.nextInt();

        if (valor <= 0 || valor % 10 != 0) {
            System.out.println("Valor invalido");
        } else {
            int notas100 = valor / 100;
            int resto = valor % 100;

            int notas50 = resto / 50;
            resto = resto % 50;
            int notas20 = resto / 20;
            resto = resto % 20;
            
            int notas10 = resto / 10;

            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 50: " + notas50);
            System.out.println("Notas de 20: " + notas20);
            System.out.println("Notas de 10: " + notas10);
        }
    }
}
