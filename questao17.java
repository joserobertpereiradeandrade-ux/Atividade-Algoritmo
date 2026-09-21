import java.util.Scanner;

public class questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro lado do triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o valor do segundo lado do triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o valor do terceiro lado do triangulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
           
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triangulo é equilatero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triangulo é isosceles.");
            } else {
                System.out.println("O triangulo é escaleno.");
            }
        } else {
            System.out.println("Os lados nao formam um triangulo.");
        }
    }
}
