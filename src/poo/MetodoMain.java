package poo;

public class MetodoMain {

    public static void main(String[] args) {
        System.out.println("Bem vindo, " + args[0] + "!");
        System.out.println("Sistema Básico de Teste");

        for (int i = 0; i < args.length; i++) {
            System.out.printf("Argumento %d: %s ", i, args[i]);            
        }
    }
    
}
