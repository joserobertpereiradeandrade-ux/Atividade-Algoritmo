import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        if(numero1> numero2) {
            System.out.println("O primeiro numero é maior");
        } else if (numero2 > numero1) {
            System.out.println("O segundo numero é maior");
        } else {
            System.out.println("Os dois são iguais");
        }
    }
}
