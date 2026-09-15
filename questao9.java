import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 0) {
            System.out.println("Criança");
        } else if (idade >= 13) {
            System.out.println("Adolescente");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade Inválida");
        }
    }
}
