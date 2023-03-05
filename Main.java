public class Main {
    public static void main(String[] args) {
        /*Polimorfismo estático:
         * - em um dos casos, invocamos o método com parâmetros
         * - no outro caso, invocamos o método sem parâmetros.
         * Na compilação, através dos parâmetros passados,
         * o Java já identifica qual versão usar!
         */
        Programador maria = new Programador("Célia");
        Programador tadeu = new Programador();
        ProgramadorJava pezzi = new ProgramadorJava("Francisco");
        /*O método "teste" (definido abaixo) recebe 1 objeto
         * Programador como parâmetro.
         * Portanto, podemos passar maria e tadeu...
         * ... ou pezzi, que é de uma classe filha de Programador!
         */
        
        testes(maria);
        testes(tadeu);
        //... ou pezzi, que é de uma classe filha de Programador!
        testes(pezzi);

    }
    public static void testes(Programador p){
        System.out.println("Agora " + p.getNome()+ " está se preparando para rodar seus testes...");
        /* Polimorfismo dinâmico:
         * p é um objeto Programador...
         * ...ou objeto de classe filha.
         * No ato da implementação da função sabemos qual o caso?
         * Não, até porque podem ser ambos (vide na main).
         * Portanto, em tempo de execução o Java decidirá
         * qual "testaCodigo()" será invocado cada vez que
         * esse trecho de código for executado.
         * O resultado dependerá do objeto passado!
         */
        p.testaCodigo();
    }
}
