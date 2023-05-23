package algoritimo_repeticao;

public class PrimeiroSwitch {
    public static void main(String[] args) {
        
        String moeda = "EURO";
        
        switch (moeda) {
            case "REAL":
                System.out.println("R$");
                break;
            case "DOLAR":
                System.out.println("$");
                break;
            default:
                System.out.println("MOEDA INDEFINIDA");
                break;
        }
    }
    
}
