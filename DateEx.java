package com.konor.HomeWorkPracticeOther;

import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long mscFromBeginning = date.getTime();
        System.out.println("milliseconds from January 1 1970 " + mscFromBeginning);
    }
}
