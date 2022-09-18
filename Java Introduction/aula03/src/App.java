public class App {
    public static void main(String[] args) throws Exception {
        int x = 3;
        int y = 2;
        float divisao = (float) x/y;
        // Cast é quando o resultado precisa ser float e as variaveis são 
        //inteiras, colocando o "(float)" o problema é resolvido.
        System.out.println(divisao);
    }
}
