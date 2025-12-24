package org.sadan.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformList {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        //convert all string to the uppercase
        // Imperative Style
        /*final List<String> upper = new ArrayList<>();
        for(String name : friends){
            upper.add(name.toUpperCase());
        }
        upper.forEach(System.out::println);*/

        //Idea : use foreach
       /* final List<String> upper = new ArrayList<>();
        friends.forEach(s-> upper.add(s.toUpperCase())); // Bad Idea, we still need empty list
        upper.forEach(System.out::println);*/

        //Using lambda expression and stream API
        List<String> list = friends.stream()
                .map(String::toUpperCase)
                .toList();
        list.forEach(System.out::println);

        //Q: what is the map method in stream api?
        //enumerate a collection --> transform it into a new collection
        // same number of elements exists in the input and the output
        //The map method is useful to map or transform an input collection into a new output collection.
        // This method will ensure that the same number of elements exists in the input and the output sequence.
        // But the element types in the input don’t have to match the element types in the output collection

    }
}
