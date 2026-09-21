import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distancia da corrida:");
        double distancia = scanner.nextDouble();

        System.out.println("Quantidade de passageiros:");
        int passageiros = scanner.nextInt();

        System.out.println("Horario de pico? (1 para sim, 0 para não)");
        int horariopico = scanner.nextInt();    

        if (distancia <= 0 || passageiros <= 0) {
            System.out.println("Distancia ou quantidade de passageiros inválida.");
        } else {
            double valorcorrida = 5 * (distancia * 2);

            if (horariopico == 1) {
                valorcorrida = valorcorrida * 1.30; 
            }

            if (passageiros > 3) {
                valorcorrida = valorcorrida + 10; 
            }
            
            if (distancia > 20) {
                valorcorrida = valorcorrida * 0.90; 
            }

            System.out.println("Distancia da corrida: " + distancia);
            System.out.println("Passageiros: " + passageiros);
            System.out.println("horario de pico: " + (horariopico == 1 ? "Sim" : "Não"));   
            System.out.println("Valor da corrida: " + valorcorrida);
        }
    }
}
