package com.konor.HomeWorkPracticeOther;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarEx {
    public static void main(String[] args) {
        String months2[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul", "Agu","Sep","Oct","Nov","Dec"};

        int year;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.print("Current date: ");
        System.out.print(months2[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gregorianCalendar.get(Calendar.DATE) + " ");
        System.out.println(year = gregorianCalendar.get(Calendar.YEAR));
        System.out.print("Current time: ");
        System.out.print(gregorianCalendar.get(Calendar.HOUR) + " : ");
        System.out.print(gregorianCalendar.get(Calendar.MINUTE) + " : ");
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        if (gregorianCalendar.isLeapYear(year)){
            System.out.println("year is leap");
        } else {
            System.out.println("year is not leap");
        }

    }
}
