import java.util.Scanner;

public class questao2 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a largura: ");
        double largura = entrada.nextDouble();

        System.out.println("Qual a altura: ");
        double altura = entrada.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println(area);
        System.out.println(perimetro);


    }
}