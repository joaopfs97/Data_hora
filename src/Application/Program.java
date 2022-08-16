package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
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
        
        
    }
    
}
