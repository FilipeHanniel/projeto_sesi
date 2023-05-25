import java.util.Scanner;

public class triangulo {
    
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;

        Scanner sc = new Scanner(System.in);

        System.out.println("                      --- PROGRAMA TRIÂNGULO ---");
        System.out.println("Digite os três lados do triângulo: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        
        
        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            if ((a == b) && (b == c)) {
                System.out.println("\nTriângulo Equilátero!");
            } else if ((a == b) || (a == c)) {
                System.out.println("\nTriânulo Isóceles!");
            } else {
                System.out.println("\nTriângulo Escaleno!");
            }

        } else {
            System.out.println("O triângulo não existe!");
        }



        sc.close();

    }
    
}
