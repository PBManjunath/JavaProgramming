package com.apple.programs.general;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args){
        LocalTime time = LocalTime.now();

        System.out.println("Time : "+time);

        LocalDate date = LocalDate.now();

        System.out.println("Date : "+date);

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date and Time: "+dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String timeInString = time.format(dateTimeFormatter);
        System.out.println("Time in String : "+timeInString);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime+"Zoned date and time");

    }
}
