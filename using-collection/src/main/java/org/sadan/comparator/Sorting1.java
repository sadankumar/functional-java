package org.sadan.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting1 {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person ( "John" , 20),
                new Person ( "Sara" , 21),
                new Person ( "Jane" , 21),
                new Person ( "Greg" , 35));
        System.out.println("Before sorting: " + people);
        Collections.sort(people);
        System.out.println("Before sorting: " + people);

        // Q:  What if in case we have more sorting scenario?


    }
}
