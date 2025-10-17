package com.pratham.corejava.Java8.DateAndTime;

import java.time.*;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        LocalDate now= LocalDate.now();
        System.out.println(now);

        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        LocalDateTime now2= LocalDateTime.now();
//        System.out.println(now2);
        LocalDateTime myDate = LocalDateTime.parse("2023-01-11T10:15:30");
//        System.out.println(ZonedDateTime.now());
//        System.out.println(myDate);
//        Set<String> availableZoneIds= ZoneId.getAvailableZoneIds();
//        availableZoneIds.forEach(System.out::println);


        Instant innow= Instant.now();
        System.out.println(innow);

        Duration d1= Duration.between(LocalTime.NOON,LocalTime.now());

        Optional<String> name = getName(2);
//        System.out.println(name.toUpperCase());

        name.ifPresent( System.out::println);


    }

    private static Optional<String>  getName(int id){

        //get from db

        return Optional.empty();
    }
}
