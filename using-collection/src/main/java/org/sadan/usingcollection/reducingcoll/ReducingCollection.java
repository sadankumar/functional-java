package org.sadan.usingcollection.reducingcoll;

import java.util.*;
import java.util.stream.Stream;

public class ReducingCollection {
    public static void main(String[] args) {

        List<String> friends = Arrays.asList("Brian", "Nates", "Nealssss", "Raju", "Sara", "Scott");
        List<String> empty_friends = Arrays.asList();
        int sum = friends.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum of chars:" + sum);

        // max
        OptionalInt max = friends.stream()
                .mapToInt(String::length)
                .max();
        System.out.println("sum of chars:" + (max.isPresent()? max.getAsInt() : 0));

        // length based sorting
        /*friends.stream()
                .mapToInt(String::length)

                .toList()*/

        // Reduce method
        Optional<String> reduce = friends.stream()
                .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);

        reduce.ifPresent(System.out::println);

        //Reduce returns the optional as value can be empty.
        Optional<String> reduce1 = empty_friends.stream()
                .reduce((name1, name2) -> name1.length() > name2.length() ? name1 : name2);

        reduce1.ifPresent(System.out::println);
        //reduce1.orElseThrow();

        // How can we gwt the max string value without the reduce
        Optional<String> maxVal = friends.stream()
                .max(Comparator.comparing(String::length));
        System.out.println(maxVal.get());

        // When using the reduce method -> it returns the optional -> value may have or empty

        // *** Reduce also support with base value -> overload function with base value
        // it does not return the Optional, it returns the base value as string
        String str = empty_friends.stream()
                .reduce("Sadan", (name1, name2) -> name1.length() > name2.length() ? name1 : name2);

        System.out.println(str);
    }
}
