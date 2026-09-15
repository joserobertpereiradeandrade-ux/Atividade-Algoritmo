import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Segundo numero2: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Operações");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Divisão");
        System.out.println("4. Multiplicação");

        System.out.println("Escolha uma Operação: ");
        int operacao = entrada.nextInt();

        if(operacao == 1) {
            System.out.println("Resultado: " + (numero1 + numero2));
        } else if(operacao == 2) {
            System.out.println("Resultado: " + (numero1 - numero2));
        } else if(operacao == 3) {
            System.out.println("Resultado: " + (numero1 / numero2));
        } else if(operacao == 4) {
            System.out.println("Resultado: " + (numero1 * numero2));
        } else {
            System.out.println("Opcao invalida");
        }
    }
}
