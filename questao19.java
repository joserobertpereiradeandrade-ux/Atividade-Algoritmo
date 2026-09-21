import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de horas: ");
        int horas = scanner.nextInt();

        if (horas <= 0) {
            System.out.println("Quantidade de horas inválida.");
        } else {
            System.out.print("Cliente cadastrado? (1 para sim, 0 para não) ");
            int clienteCadastrado = scanner.nextInt();

            double valorhora = 0;

            if (horas <= 1) {
                valorhora = 10.0;
            } else if (horas <= 2) {
                valorhora = 20.0;
            } else if (horas <= 3) {
                valorhora = 30.0;
            } else {
                valorhora = 40.0;
            }

            double valorfinal;

            if (horas > 8) {
                valorfinal = 50.0;
            } else if (clienteCadastrado == 1) {
                valorfinal = valorhora * 0.80; 
            } else {
                valorfinal = valorhora;
            }

            System.out.println("Valor a ser pago: " + valorfinal);
        }
    }
}
