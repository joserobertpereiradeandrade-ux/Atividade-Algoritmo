import java.util.Scanner;

public class questao1 {
    public static void main (String []args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        int idadedps = idade + 1;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(idadedps);
    }
}