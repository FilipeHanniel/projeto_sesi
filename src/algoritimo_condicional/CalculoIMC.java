package algoritimo_condicional;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura,2); 

        if (imc < 18.5) {
            System.out.printf("IMC: %.1f Estágio MAGREZA", imc);
        } else if (imc < 25) {
            System.out.printf("IMC: %.1f Estágio NORMAL", imc);
        } else if (imc < 30) {
            System.out.printf("IMC: %.1f Estágio SOBREPESO I", imc);
        } else if (imc < 40) {
            System.out.printf("IMC: %.1f Estágio OBESIDADE II", imc);
        } else {
            System.out.printf("IMC: %.1f Estágio OBESIDADE GRAVE III", imc);
        }
        



        sc.close();
    }
    
}
