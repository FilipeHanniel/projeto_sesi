package getset;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome;
        String teste;

        Lista lista = new Lista();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();

        lista.setNome(nome);
        
        System.out.println("Confirme se o nome está correto: \n");
        teste = lista.getNome();

        System.out.println(teste);
        sc.close();
    }
    
}
