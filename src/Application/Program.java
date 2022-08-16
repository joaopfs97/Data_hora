package Application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {
        
        /* //Instanciando Datetime
        Locale.setDefault(Locale.US);
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-08-16");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-16T15:08:20");
        Instant d06 = Instant.parse("2022-08-16T15:08:20Z");
        //Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
        LocalDate d08 = LocalDate.of(2022, 8, 16);
        LocalDateTime d09 = LocalDateTime.of(2022, 8, 16, 16, 56);
        
        System.out.println("Data local: " + d01);
        System.out.println("Data e hora local: " + d02);
        System.out.println("Data e hora no fuso GMT 0: " + d03);
        System.out.println("Data local a partir de uma String: " + d04);
        System.out.println("Data e hora local a partir de uma String: " + d05);
        System.out.println("Data e hora no fuso GMT 0 a partir de uma String: " + d06);
        System.out.println("Data local com imput: " + d08);
        System.out.println("Data e hora local com imput: " + d09);
        */
        
        /*// Convertendo data-hora
        LocalDate d04 = LocalDate.parse("2022-08-16");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-16T15:08:20");
        Instant d06 = Instant.parse("2022-08-16T15:08:20Z");
        
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
        
        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04));
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        System.out.println("d05 = " + d05.format(fmt1));
        System.out.println("d05 = " + d05.format(fmt2));
        System.out.println("d05 = " + d05.format(fmt4));
        System.out.println("d06 = " + fmt3.format(d06));
        System.out.println("d06 = " + fmt5.format(d06));
        System.out.println("d06 = " + d06.toString());
        */
        /* // Diferença entre data-horas
        LocalDate d04 = LocalDate.parse("2022-08-16");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-16T15:08:20");
        Instant d06 = Instant.parse("2022-08-16T15:08:20Z");
        
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        
        System.out.println("Past Week = " + pastWeekLocalDate);
        System.out.println("Next Week = " + nextWeekLocalDate);
        
        
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        
        System.out.println("Past Week = " + pastWeekLocalDateTime);
        System.out.println("Next Week = " + nextWeekLocalDateTime);
        
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        
        System.out.println("Past Week = " + pastWeekInstant);
        System.out.println("Next Week = " + nextWeekInstant);
        
        
        Duration t1 = Duration.between(pastWeekLocalDateTime, nextWeekLocalDateTime);
        System.out.println("Duration = " + t1.toDays());
       */
        
    }
    
}
