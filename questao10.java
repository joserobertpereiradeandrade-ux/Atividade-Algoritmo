import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero");
        int numero3 = entrada.nextInt();

        int maior = numero1;
        int menor = numero1;

        if(numero2 > maior) {
            maior = numero2;
        } 
        if(numero3 > maior) {
            maior = numero3;
        }
        if(numero2 < menor) {
            menor = numero2;
        }
        if(numero3 < menor) {
            menor = numero3;
        }

        System.out.println("Maior numero" + maior);
        System.out.println("Menor numero" + menor);
    }
}
