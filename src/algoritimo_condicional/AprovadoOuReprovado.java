package algoritimo_condicional;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        // ler 3 notas; calcular a média aritmética e determinar se < 5 = reprovado, entre 5 e 6 recuperação, maior que 6, aprovado
        // a nota não pode ser maior que 10
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a N1: ");
        float n1 = Float.parseFloat(sc.next().replace('.',','));
        if (n1 > 10) {
            System.out.println("NOTA INVÁLIDA");
            n1 = 10;
        }

        System.out.print("Digite a N2: ");
        float n2 = Float.parseFloat(sc.next().replace('.',','));
        if (n2 > 10) {
            System.out.println("NOTA INVÁLIDA");
            n2 = 10;
        }

        System.out.print("Digite a N3: ");
        float n3 = Float.parseFloat(sc.next().replace('.',','));
        if (n3 > 10) {
            System.out.println("NOTA INVÁLIDA");
            n3 = 10;
        }

        float media = (n1 + n2 + n3) / 3;

        sc.close();

        System.out.println("A média do aluno é: " + media);

        if (media < 5) {
            System.out.println("ALUNO REPROVADO!");
        } else if (media < 6 ) {
            System.out.println("ALUNO EM RECUPERAÇÃO!");
        } else {
            System.out.println("ALUNO APROVADO!");
        }

    }
    
}
