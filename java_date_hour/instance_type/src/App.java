
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        //Vamos instanciar horar de varias formas

        //Começando por instanciar uma data local
        LocalDate dataLocal = LocalDate.now();

        //Data local com horario local
        LocalDateTime dataHoraLocal = LocalDateTime.now();

        //Data-hora global padrão GMT horário de Londres
        Instant dataHoraGlobal = Instant.now();

        //Agora vamos fazer a conversão de um texto no padrão ISO 8601: Padrão de horario em texto.
        //para o tipo LocalDate e LocalDateTime e para data-hora global com instant

        LocalDate dataParse = LocalDate.parse("2025-07-29");
        LocalDateTime dataHoraParse = LocalDateTime.parse("2025-07-29T01:22");
        //O z representa zulutime GMT-0 horario de Londres
        Instant dataHoraGlobalParse = Instant.parse("2025-07-29T01:23:00Z");

        //O -03:00 representa horario de brasilia hora GMT-0 horário de londres veja sem vai estar 3hrs a frente
        // Exemplo com offset de -03:00 (Brasília)
        Instant dataHoraGlobalParseComOffset = Instant.parse("2025-07-29T01:23:00-03:00");

        //Agora para textos customizado imagine um sistema que recebe datas do usuário e precisa salvar
        //isso em um banco de dados e preciso então converter para formato aceito ISO 8601 atraves
        // da class DateTimeFormatter do Java: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        // Para data custom
        LocalDate dataLocalCustom = LocalDate.parse("29/07/2025", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        //Para data-hora local custom
        //Podemos salvar em uma variavel tambem para enxugar a declaração
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime dataHoraLocalCustom = LocalDateTime.parse("29/07/2025 01:29", fmt);
        
        //Por fim para dados isolados o LocalDate time recebe no metodo of(ano/mes/dia);
        LocalDate dataIsolada = LocalDate.of(2025, 07, 29);

        //Para LocalDateTime ele recebe no of(ano/mes/dia hh:mm:ss:ms) e tambem varios outros.
        LocalDateTime dataHoraIsolada = LocalDateTime.of(2025, 07, 28 , 01,29,45);


        System.out.println("Data local :" + dataLocal);
        System.out.println("Data-hora local: " + dataHoraLocal);
        System.out.println("Data-hora global: " + dataHoraGlobal);
        System.out.println("Data convertida: " + dataParse);
        System.out.println("Data-hora convertida: " + dataHoraParse);
        System.out.println("Data-hora global convertida: " + dataHoraGlobalParse);
        System.out.println("Data-hora global Londres: " + dataHoraGlobalParseComOffset);
        System.out.println("Data-local custom: " + dataLocalCustom);
        System.out.println("Data-hora local custom: " + dataHoraLocalCustom);
        System.out.println("Data local isolada: " + dataIsolada);
        System.out.println("Data-hora local isolada: " + dataHoraIsolada);
    }
}
