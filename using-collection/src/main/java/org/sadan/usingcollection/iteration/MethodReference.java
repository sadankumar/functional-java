package org.sadan.usingcollection.iteration;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        friends.forEach(System.out::println);

        //When to use the method reference?
        //A: Makes the lambda expression shorter.
        // Used with direct call with instance or static method
        //we can’t use this convenience if we have to manipulate
        //parameters before sending them as arguments or tinker with the call’s results before returning them.

    }
}
