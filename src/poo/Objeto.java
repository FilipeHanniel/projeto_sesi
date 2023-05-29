package poo;

public class Objeto {

    private String nome;
    private int codigo;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String novoNome) {
        if () {
            nome = novoNome;
        }
        
    }

    public void setCodigo(int novoCodigo) {
        if (codigo < 0) {
            codigo = novoCodigo;    
        } else {
            System.out.println("Valor inválido");
        }
        
    }

    public String getDesricao    

    public void setDescricao(String novaDescricao) {
        if (novaDescricao.equals("")) {
            descricao = "SEM DESCRIÇÃO";
        } else {
            descricao = novaDescricao;
        }
    }
}
