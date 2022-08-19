package com.konor.HomeWorkPracticeOther;

import java.util.StringTokenizer;

public class StringTokenizeDemo {
    static String in = "Versity=Top Academy;Course=Topjava;Group=222;Year=2022";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in,"=;");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
