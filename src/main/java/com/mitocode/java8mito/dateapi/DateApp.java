package com.mitocode.java8mito.dateapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateApp {

    public void verify(int version) {
        if (version == 7) {
            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
            date1.set(2021, 0, 21);
            System.out.println(date1.after(date2));
        } else if (version == 8) {
            LocalDate date1 = LocalDate.of(1994, 04, 04);
            LocalDate date2 = LocalDate.now();
            System.out.println(date1.isAfter(date2));
            System.out.println(date1.isBefore(date2));

            LocalTime time1 = LocalTime.of(22, 30, 50);
            LocalTime time2 = LocalTime.now();
            System.out.println(time1.isAfter(time2));
            System.out.println(time1.isBefore(time2));

            LocalDateTime dateTime1 = LocalDateTime.of(2024, 4, 4, 22, 30, 50);
            LocalDateTime dateTime2 = LocalDateTime.now();
            System.out.println(dateTime1.isAfter(dateTime2));
            System.out.println(dateTime1.isBefore(dateTime2));
        }
    }

    public void toSizeTime(int version) throws  InterruptedException {
        if (version == 7) {
            long init = System.currentTimeMillis();
            Thread.sleep(1000);
            long end = System.currentTimeMillis();
            System.out.println(end - init);
        } else if (version == 8) {
            Instant init = Instant.now();
            Thread.sleep(1000);
            Instant end = Instant.now();
            System.out.println(Duration.between(init, end).toMillis());
        }
    }

    public void periodBetweenDates(int version) {
        if (version == 7) {
            Calendar bornDate = Calendar.getInstance();
            Calendar actualDate = Calendar.getInstance();

            bornDate.set(1994, 3, 4);
            actualDate.set(2017, 5, 4);
            int years = 0;

            while (bornDate.before(actualDate)) {
                bornDate.add(Calendar.YEAR, 1);
                if (bornDate.before(actualDate)) {
                    years++;
                }
            }
            System.out.println(years);
        } else if (version == 8) {
            LocalDate bornDate = LocalDate.of(1994, 4, 4);
            LocalDate actualDate = LocalDate.now();

            Period period = Period.between(bornDate, actualDate);
            System.out.println("It has passed " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days" +
                    " since " + bornDate + " to " + actualDate);
        }
    }

    public void convert(int version) throws ParseException {
        if (version == 7) {
            String date = "04/04/1994";
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date convertedDate = dateFormat.parse(date);
            System.out.println(convertedDate);

            Date actualDate = Calendar.getInstance().getTime();
            dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
            String stringDate = dateFormat.format(actualDate);
            System.out.println(stringDate);
        } else if (version == 8) {
            String date = "04/04/1994";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.println(localDate);
            formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
            System.out.println(formatter.format(localDate));
        }
    }

    public static void main(String args[]) throws InterruptedException, ParseException {
        DateApp app = new DateApp();
        //app.verify(8);
        //app.toSizeTime(8);
        //app.periodBetweenDates(8);
        app.convert(8);
    }

}
