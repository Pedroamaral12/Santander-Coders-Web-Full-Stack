public class App {
    public static void main(String[] args) throws Exception {
        /*for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        for (int i = 10; i<=20; i++){
            System.out.println(i);
        }
        for (int i = 0; i<=100; i+=10){
            System.out.println(i);
        }*/
        //exemplos
        for (int i = 1; i<=10; i++){
            for (int j = 1; j<=10; j++){
                System.out.println(j + "*" + i + " = " + j*i);
            }
            //quando aninhados o for interior é executado primeiro
        }
    }
}
