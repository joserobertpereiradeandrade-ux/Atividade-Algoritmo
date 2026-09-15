import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.println("Digite sua porcentagem de frequencia (0 a 100): ");
        double frequencia = entrada.nextDouble();

        System.out.println("Situacao financeira, digite 1 para regular e 0 para pendente: ");
        int situacaofinanceira = entrada.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media < 7) {
            System.out.println("Reprovado");
            System.out.println("Falta de nota");
        } else if(frequencia < 75) {
            System.out.println("Reprovado");
            System.out.println("Falta de presenca");
        } else if(situacaofinanceira == 0) {
            System.out.println("Reprovado");
            System.out.println("Pendencia financeira");
        } else {
            System.out.println("Aprovado");
        }
    }
}