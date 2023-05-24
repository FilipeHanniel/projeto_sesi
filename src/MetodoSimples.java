
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MetodoSimples {
    
    // void > não retorna nada

    public static void main(String[] args) {
        // Método simples "Sem parãmetros"
        // <encapsulamento> <static 'opcional'> <retorno> <nomeDoMetodo>() { <codigo> }

        mostrarData();
        mostrarData();
        String data = pegarData();
        System.out.println(data);
       

    }
    
    public static void mostrarData() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }

    public static String pegarData() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return dateTime.format(formatter);
    }

    // Método / Função
    // Com Retorno: é preciso especificar o tipo de retorno e utilizar a expressão return <valor>;
    // > Retorna um valor há ser utilizado.

    // Sem Retorno: o tipo de retorno é null e não precisa utilizar o return <valor>;
    // > Apenas executa o código dentro do bloco.
}
