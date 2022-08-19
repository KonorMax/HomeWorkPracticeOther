package com.konor.HomeWorkPracticeOther;

import java.util.Objects;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        //Objects o = null;

        if (noVal.isPresent()) System.out.println("Doesn't display anything");
        else System.out.println("No values");

        if (hasVal.isPresent()) System.out.println("hasVal contents values: " + hasVal.get());

        System.out.println(noVal);
        //System.out.println(o);
        String defaultString = noVal.orElse("default string");
        System.out.println(defaultString);

    }
}
