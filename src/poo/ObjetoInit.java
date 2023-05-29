package poo;

public class ObjetoInit {
    
    public static void main(String[] args) {
        
        Objeto obj = new Objeto();

        obj.setNome("Teste");
        obj.setCodigo(10);
        obj.setDescricao("");

        System.out.println(obj.getNome());

    }
}
