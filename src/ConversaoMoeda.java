import java.util.Scanner;

public class ConversaoMoeda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cotação atual do dólar: $ ");
        float cotacao = sc.nextFloat();

        System.out.print("Valor em reais: R$  ");
        float reais = sc.nextFloat();
        float iof = 0.0638f;

        float valorCalculado = reais * cotacao;
        
        float taxaIof = valorCalculado * iof;

        float valorRecebido = valorCalculado - taxaIof;

        System.out.printf("Valor pago em reais: R$ %.2f\n", reais);
        System.out.printf("Calculo direto: R$ %.2f\n", valorCalculado);
        System.out.printf("Taxa do IOF: R$ %.2f\n", taxaIof);
        System.out.println("O valor total a ser recebido é de R$ " + valorRecebido);


        sc.close();
    }
}
