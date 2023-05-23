package algoritimo_repeticao;

import java.util.Scanner;

public class PrimeiroArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Ana", "Jean", "Italo", "Maria"};

       


        for (int i = 0; i < nomes.length; i++) {
            System.out.println("NOME: " + nomes[i]);

        }

        for (String name : nomes) {
            if (name.equals("Italo")) {
                break;
            }
            System.out.println("DIRETO> " + name);
        }

        sc.close();
    }
    
}
