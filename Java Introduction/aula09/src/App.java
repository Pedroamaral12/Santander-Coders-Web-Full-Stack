public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Let's code";
        saudacao(nome);
        //define o parâmetro
        int resultado = soma(2,3);
        System.out.println(resultado);
    }
    public static void saudacao(String nome){
        //define o escopo
        System.out.println("Hello, " + nome);


    }
    public static int soma(int a, int b){
        return a + b;
    }
}
