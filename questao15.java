import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de distancia: ");
        double distancia = scanner.nextDouble();

        System.out.print("Qual o consumo medio do carro em km/l: ");
        double consumoMedio = scanner.nextDouble();

        System.out.print("Qual o preco do gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double litrosGastos = distancia / consumoMedio;
        double custoTotal = litrosGastos * precoGasolina;

        System.out.println("O custo total da viagem é: " + custoTotal);
    }
}
