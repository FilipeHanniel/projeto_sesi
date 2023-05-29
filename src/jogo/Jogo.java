package jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int pontosEu = 0;
        int pontosPc = 0;

        System.out.println("     --- JOKENPÔ ---");

        System.out.println("Quantas rodadas deseja jogar?");
        int qt = sc.nextInt();

        for (int i = 0; i < qt; i++) {
            System.out.println("0 - Pedra / 1 - Papel / 2 - Tesoura");
            int opEu = sc.nextInt();
            int opPc = rnd.nextInt(3);
            
            if (opEu ==  opPc) {
                System.out.println("Empate!");
            } else if (opEu == 0) {
                if (opPc == 1) {
                    pontosPc++;
                    System.out.println("Pontos do PC");
                } else if (opPc == 2) {
                    pontosEu++;
                    System.out.println("Ponto Seu!");
                }
            } else if (opEu == 1) {
                if (opPc == 0) {
                    pontosPc++;
                    System.out.println("Pontos do PC");

                }else if ()
            }
        }

        sc.close();
    }
   
    String getOpcao(int value) {
        switch (value) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";x
        }
    }
    
}
