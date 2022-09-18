import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = new int[5];
        // indices de 0 a 4 (n-1)
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        // print de array vai te dar a localização dele na memoria, 
        //não seu conteudo
        for (int i=0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }

        System.out.println(" ");

        String[] letras = { "A", "B", "C", "D", "E"};
        for (int i=0; i< letras.length; i++){
            System.out.println(letras[i]);
        }
        System.out.println(Arrays.toString(letras));
    }
}
