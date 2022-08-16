package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-08-16");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-16T15:08:20");
        Instant d06 = Instant.parse("2022-08-16T15:08:20Z");
        Instant d07 = Instant.parse("2022-08-16T15:08:20-03:00");
    
        System.out.println("Data local: " + d01);
        System.out.println("Data e hora local: " + d02);
        System.out.println("Data e hora no fuso GMT 0: " + d03);
        System.out.println("Data local a partir de uma String: " + d04);
        System.out.println("Data e hora local a partir de uma String: " + d05);
        System.out.println("Data e hora no fuso GMT 0 a partir de uma String: " + d06);
        System.out.println("Data e hora no fuso GMT -03:00 a partir de uma String: " + d07);
        
        
    }
    
}
