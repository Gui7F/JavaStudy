
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        //Vamos acrescentar dias a objetos LocalDate LocalDateTime e Instant
        //E possivel acrescentar dias anos meses horas e segundo nanoseg e mais
        //Mais vamos fazer exemplos basicos de calculo aqui

        LocalDate dataLocal = LocalDate.parse("2025-07-30");
        LocalDateTime dataHoraLocal = LocalDateTime.parse("2025-07-30T01:30");
        Instant dataHoraGlobal = Instant.parse("2025-07-30T01:23:00Z");

        //Adicionando e subtraindo 7 dias em LocalDate, e preciso instanciar outro sempre
        LocalDate nextWeekLocalDate = dataLocal.plusDays(7);
        LocalDate pastWeekLocalDate = dataLocal.minusDays(7);
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);

        //Add e subtraindo 7 dias em LocalDateTime.
        LocalDateTime nextWeekLocalDateTime = dataHoraLocal.plusDays(7);
        LocalDateTime pastWeekLocalDateTime = dataHoraLocal.minusDays(7);
        System.out.println("nextWeekLocalDateTime: "+ nextWeekLocalDateTime);
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);

        //Adicionando e subtraindo 7 dias em Instant
        //O objeto choronoUnit serve para marca unidade de data-hora veja sempre a doc
        Instant nextWeekInstant = dataHoraGlobal.plus(7, ChronoUnit.DAYS);
        Instant pastWeekInstant = dataHoraGlobal.minus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant: " + nextWeekInstant);
        System.out.println("pastWeekInstant: " + pastWeekInstant);

        //Calculo de duração entre duas data-hora vamos usar Duration

        //Duration duration1 = Duration.between(dataLocal, nextWeekLocalDate);
        //Desta forma causa exception porque LocaDate tem ser convertido para LocalDateTime
        //é preciso hora para calcular duration, e LocalDate nao possuem este atributo
        //atStartOfDay() coverte ele para LocalDateTime a 00:00
        Duration duration1 = Duration.between(dataLocal.atStartOfDay(), nextWeekLocalDate.atStartOfDay());
        System.out.println("Duration data local: " + duration1.toDays());

        Duration duration2 = Duration.between(dataHoraLocal, nextWeekLocalDateTime);
        System.out.println("Duration data-hora local: " + duration2.toDays());

        Duration duration3 = Duration.between(dataHoraGlobal, nextWeekInstant);
        System.out.println("Duration data-hora global: " + duration3.toDays());

        //Todas as duration dao a diferença de 7 dias como esperado vale observar e preciso usar documentação
        //Para lidar com datas pois a muitas formas de manipular este objetos em Java.
    }
}
