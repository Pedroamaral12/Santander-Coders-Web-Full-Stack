import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Pedro";
        String nome002 = "pedro";
        System.out.println(nome.equals(nome002));
        System.out.println(nome.equalsIgnoreCase(nome002));


        // ISO 8601 padrão de data
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao = "";
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour()>= 0 && agora.getHour()<12){
            saudacao = "Bom dia";
        }else if(agora.getHour()>= 12 && agora.getHour()<18){
            saudacao = "Boa tarde";
        }else if(agora.getHour()>= 18 && agora.getHour()<24){
            saudacao = "Boa Noite";
        }else{
            saudacao ="Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaDaSemana,saudacao.toUpperCase());
    }
}
