import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto");
        double valor = entrada.nextDouble();

        double percentual = 0;

        if(valor <= 100) {
            percentual = 0;
        } else if(valor <= 500) {
            percentual = 10;
        } else {
            percentual = 20;
        }

        double valordesconto = valor * (percentual/ 100);
        double valorfinal = valor - valordesconto;

        System.out.println("Valor original: R$" + valor);
        System.out.println("Percentual de deconto: " + percentual + "%");
        System.out.println("Valor do desconto: R$" + valordesconto);
        System.out.println("Valor final do produto: R$" + valorfinal);
    }
}
