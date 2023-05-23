package algoritimo_condicional;

import java.util.Scanner;

public class PortaDeBalada {
    public static void main(String[] args) {
        // permitir a entrada caso tenha 18 anos ou mais, senão, barrar a pessoa.

        // criar uma variável idade para armazenar a idade que o usuário digitar.
        // depois, verificar se a idade é >= 18

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("ENTRADA PERMITIDA!"); 
        } else {
            System.out.println("ENTRADA BLOQUEADA!!!");
        }

        sc.close();

    }
    
}
