package data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeeLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeeLocalDate = " + nextWeeLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalInstant = " + pastWeekLocalInstant);
        System.out.println("nextWeekLocalInstant = " + nextWeekLocalInstant);
        System.out.println();
        System.out.println("----------------DURAÇÃO------------");
        System.out.println();

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0,0));
        Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t4 = Duration.between(pastWeekLocalInstant, d06);
        Duration t5 = Duration.between(d06, pastWeekLocalInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
        System.out.println("t5 dias = " + t5.toDays());
    }
}
