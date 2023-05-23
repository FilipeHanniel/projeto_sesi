public class Array {
    public static void main(String[] args) {
        // <tipo>[] nomeDoArray = new <tipo>[<tamanho>];
        // <tipo>[] nomeDoArray = {<valor>, <valor>, <valor>};

        String[] nomes = new String[5];
        // 0 1 2 3 4 

        nomes[2] = "Italo";

        System.out.println(nomes.length);

        System.out.println(nomes[1]);
    }
    
}
