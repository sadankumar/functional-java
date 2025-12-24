package org.sadan.skippingvalues;

import java.util.Arrays;
import java.util.List;

public class TakeWhile {
    public static void main(String[] args) {

        List<String> friends = Arrays.asList("Brian", "Nates", "Neals", "Raju", "Sara", "Scott");

        List<String> list = friends.stream()
                .takeWhile(s -> s.length() > 4)
                .toList();
        list.forEach(System.out::println);

        //Q: What is takeWhile function on the stream
        // A: It is like a break;
        //

    }
}
