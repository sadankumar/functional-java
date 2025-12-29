package org.sadan.java8questions.bookreference;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        //Convert list to Map with custom value
        List<String> names = List.of("Jim", "kim", "mill", "sim");
        listToMapWithCustomVal(names);

        //
    }

    private static void listToMapWithCustomVal(List<String> names) {
        Map<String, Integer> nm = names.stream()
                .collect(Collectors.toMap(s -> s, String::length));

        Map<String, Integer> nm1 = names.stream()
                .collect(Collectors.toMap(s -> s, String::length));
        nm1.forEach((k,v)-> System.out.println("key: "+ k + " : " + v));

    }
}
