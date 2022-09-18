public class App {
    public static void main(String[] args) throws Exception {
        int nota = 70;
        String graduacao = "";
        if(nota>=70){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno reprovado");
        }

        if(nota>=90){
            System.out.println("Resultado: A");
            graduacao = "A";
        }else if(nota<90 && nota>=80){
            System.out.println("Resultado: B");
            graduacao = "B";
        }else if(nota<80 && nota>=70){
            System.out.println("Resultado: C");
            graduacao = "C";
        }else if(nota<70 && nota>=60){
            System.out.println("Resultado: D");
            graduacao = "D";
        }else if(nota<60 && nota>=50){
            System.out.println("Resultado: E");
            graduacao = "E";
        }else if(nota<50){
            System.out.println("Resultado: F");
            graduacao = "F";
        }else{System.out.println("Nota inválida");}
        
        switch(graduacao){
            case "A":
            case "B":
            case "C":
                System.out.println("O aluno obteve uma pontuação maior ou igual a 70");
                break;
            case "D":
            case "E":
            case "F":
                System.out.println("O aluno obteve uma pontuação menor ou igual a 70");
                break;
            default:
                System.out.println("Graduação inválida");    
        }
    }
}
