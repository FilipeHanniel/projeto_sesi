package algoritimo_condicional;

import java.util.Scanner;

public class CalculoConsumo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Kilometragem inicial: ");
        float kmInicial = sc.nextInt();
        System.out.print("Digite a quantidade de litros abastecido: ");
        float litros = sc.nextInt();
        System.out.print("Digite a kilometragem final: ");
        float kmFinal = sc.nextInt();

        float kms = kmFinal - kmInicial;

        float consumo = kms / litros;

        System.out.println(String.format(" O Consumo médio é de : %.2f km/l ", consumo));

        sc.close();
    }
    
}
