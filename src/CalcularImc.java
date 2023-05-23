public class CalcularImc {
    public static void main(String[] args) {
        float peso = 83.5f;
        float altura = 1.92f;

        float imc = peso / (altura * altura);

        System.out.printf("Valor do IMC: %.2f\n", imc);
    }
    
}
