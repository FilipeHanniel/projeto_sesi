package poo;

public class Init {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.soma(10,10);

        Calculadora.subtracao(10, 5);

        Pessoa p1 = new Pessoa("Teste", 35);
        Pessoa p2 = new Pessoa("Teste2", 33);


        p1.nome = "Filipe";
        p1.idade = 42;

       

        

        p2.nome = "Jemima";
        p2.idade = 43;

        System.out.println(p1.nome + p1.idade);
        System.out.println(p2.nome + p2.idade);

        p1.imprimir();
        p2.imprimir();

        Init2.main(args);
    }
}
