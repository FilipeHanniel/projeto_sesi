package poo;

// public > Encapsulamento onde o objeto é visível para qualquer outra Classe no código
// private > Encapsulamento que só permite o objeto ser visto pela Classe atual

// void > Que não retorna nada
// String, int, float, double, boolean
// Calculadora

public class Calculadora {
    
    public void soma(int a, int b) {
        System.out.println(a + b);
    }

    public static void soma(double a, double b) {
        System.out.println(a + b);
    }

    public static void subtracao(int a, int b) {
        System.out.println(a - b);
    }

    // static > Permite o acesso sem a criação de um objeto

}
