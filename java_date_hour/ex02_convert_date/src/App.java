import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App {
    public static void main(String[] args) throws Exception {
        // Vamos formatar objetos Instant LocalDate e LocalDateTime
        //para textos customizado ou seja processo contrario agora.

        LocalDate dateCustom = LocalDate.parse("2025-07-29");
        LocalDateTime dateHourCustom = LocalDateTime.parse("2025-07-29T01:29");
        Instant dateHourGlobal = Instant.parse("2025-07-29T02:30:00Z");

        // Vamos criar o formatter e passar dentro do metodo format() do LocalDate o nosso
        // objeto com formatter e tambem o contrario e possivel como voce vai ver.

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Para horario global preciso acessa depois do formatter o time zone
        // e colocar o ZoneId como SystemDefault ou seja ele vai pegar o horario
        //local e data local do sistem do usuario
        DateTimeFormatter fmt3 = DateTimeFormatter
        .ofPattern("dd/MM/yyyy HH:mm")
        .withZone(ZoneId.systemDefault());
        
        //Desta forma é usando metodos prontos tem varios aconselho sempre olhar
        // a doc para aprender de forma mais profunda .SHORT traz mesmo resultado
        // do fmt3 porem tem varios outros alem do LocalizedDateTime ja prontos em
        //DateTimeFormatter
        DateTimeFormatter fmt4 = DateTimeFormatter
        .ofLocalizedDateTime(FormatStyle.SHORT)
        .withZone(ZoneId.systemDefault());

        //Acessando format por LocalDate
        System.out.println(dateCustom.format(fmt1));
        //Acessando format por DateTimeFormatter
        System.out.println(fmt1.format(dateCustom));

        //Formatando data-hora customizada
        System.out.println(dateHourCustom.format(fmt2));

        // Formatando data-hora global para texto customizado
        System.out.println(fmt3.format(dateHourGlobal));

        // Formatando data-hora global para texto customizado
        System.out.println(fmt4.format(dateHourGlobal));

        //Agora aqui vamos converter data-hora global Instant para data-hora local

        Instant dataGlobal = Instant.parse("2025-07-22T01:00:00Z"); //Londres 01:00
        //Convertido para sua dada hora local
        LocalDateTime dataConvertida = LocalDateTime.ofInstant(dataGlobal, ZoneId.systemDefault());

        //Convertido para portugal
        LocalDateTime dataPortugal = LocalDateTime.ofInstant(dataGlobal, ZoneId.of("Portugal"));

        System.out.println("Data global covertida: " + dataConvertida ); //GTM seu sistema
        System.out.println("Data global para portugal: "+ dataPortugal); //GTM+4


    }
}
