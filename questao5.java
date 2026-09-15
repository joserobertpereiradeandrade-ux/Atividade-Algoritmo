import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = entrada.nextInt();

        if (numero >= 1) {
            System.out.println("Positivo");
        } else if ( numero <= -1) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }
}
