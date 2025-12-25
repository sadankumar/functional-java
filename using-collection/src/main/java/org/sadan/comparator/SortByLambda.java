package org.sadan.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLambda {
    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(
                new Person ( "John" , 20),
                new Person ( "Sara" , 21),
                new Person ( "Jane" , 18),
                new Person ( "Greg" , 35));

        // sort method.
        // its List so, sort is enough
        //we can use stream sorted, this excepts comparator
        /*List<Person> list = people.stream()
                .sorted(Person::ageDifference)
                .toList();
        System.out.println(list);*/

        // ho to improve it
        Comparator<Person> compareAscending = Person::ageDifference;
        Comparator<Person> compareDescending = compareAscending.reversed();

        List<Person> list = people.stream()
                .sorted(compareAscending)
                .toList();
        System.out.println(list);

        List<Person> list1 = people.stream()
                .sorted(compareDescending)
                .toList();
        System.out.println(list1);

        
    }
}

