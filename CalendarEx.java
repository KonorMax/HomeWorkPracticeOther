package com.konor.HomeWorkPracticeOther;

import java.util.Calendar;

public class CalendarEx {
    public static void main(String[] args) {
        String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul", "Agu","Sep","Oct","Nov","Dec"};

        Calendar calendar = Calendar.getInstance();

        System.out.print("Current date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.print("Current time: ");
        System.out.print(calendar.get(Calendar.HOUR) + " : ");
        System.out.print(calendar.get(Calendar.MINUTE) + " : ");
        System.out.println(calendar.get(Calendar.SECOND));

        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 10);
        calendar.set(Calendar.SECOND, 10);

        System.out.print("Changed time: ");

        System.out.print(calendar.get(Calendar.HOUR) + " : ");
        System.out.print(calendar.get(Calendar.MINUTE) + " : ");
        System.out.print(calendar.get(Calendar.SECOND));
    }
}

