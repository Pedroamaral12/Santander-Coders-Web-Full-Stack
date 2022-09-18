public class App {
    public static void main(String[] args) throws Exception {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);
        if(fimDeSemana && fazendoSol == true){
            System.out.println("Vamos a praia");
        };
        //dois metodos de escrever condicional
        fimDeSemana = false;
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
        //operador ternário
    }
}
