import java.util.Scanner;

public class questao3 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();
        
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println(numero);
        System.out.println(antecessor);
        System.out.println(sucessor);
        System.out.println(dobro);
        System.out.println(triplo);
    }
}
