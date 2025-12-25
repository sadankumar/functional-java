package org.sadan.usingcollection.findelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElement {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        friends.forEach(System.out::println);

        System.out.println("\nFind element start with -N :");

        /*final List<String> startWithNList = new ArrayList<>();
        for(String str : friends){
            if(str.startsWith("N")){
                startWithNList.add(str);
            }
        }
        startWithNList.forEach(System.out::println);*/

        List<String> list = friends.stream()
                .filter(n -> n.startsWith("N"))
                .toList();
                //.collect(Collectors.toList());
                //Collectors.toUnmodifiableList()
        list.forEach(System.out::println);

        //Q: What is filter method?
        // A: The filter() function is useful to cherry-pick elements in a collection based on
        //the criteria
        // The filter method returns a Stream, which is an internal iterator, similar to map method.
        // filter method may have same number of element returned
        // Range: 0 to max(num of element)

        //
        //.toList();  - Java 16
        //.collect(Collectors.toList());
        //Collectors.toUnmodifiableList() - Java 10
    }
}
