package org.sadan.usingcollection.skippingvalues;

import org.sadan.Constants;

import java.util.Arrays;
import java.util.List;

public class SkippingValues {
    public static void main(String[] args) {

        List<String> friends = Arrays.asList("Brian", "Nates", "Neals", "Raju", "Sara", "Scott");
       // friends.forEach(System.out::println);

        // Skip the first 4 values
        /*List<String> list = friends.stream()
                .skip(4)
                .map(String::toUpperCase)
                .toList();
        list.forEach(System.out::println);*/

        // How to skip with certain condition
//"Brian", "Nate", "Neal", "Raju", "Sara", "Scott"
        List<String> list1 = friends.stream()
                //.skip()// it just expects Long type
                .dropWhile(s -> s.length() > 4)
                .map(String::toUpperCase)
                .toList();
        list1.forEach(System.out::println);

        // Q: What is the difference between "filter" and "skip,"dropWhile"
        // A: filter() works like a check for each element in stream
        // skip: once condition is satisfied, it does not scan element
        //like continue
        //filter() works like a garage gate that opens or shuts for each
        //approaching car, skip() and dropWhile() work more like a door that is closed
        //initially, swings open, and then stays open.

    }
}
