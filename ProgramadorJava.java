public class ProgramadorJava extends Programador {
    public ProgramadorJava(){
        super("javeiro anônimo");
    }
    public ProgramadorJava(String nome){
        super(nome);
    }
    public void testaCodigo(){
        System.out.println(this.getNome()+" testa o código e ... java.lang.NullPointerException :(");
    }
}
