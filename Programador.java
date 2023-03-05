/**
 * Programador
 */
public class Programador {

    private String nome;
    public Programador(){
        this.nome = "<anônimo>";
    }
    public Programador(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void testaCodigo(){
        System.out.println(this.nome + " executa seu código e ... funcionou!");
    }
}