package org.sadan.iteration;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListIteration {
    public static void main(String[] args) {
        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

       /* //iterating list
        for (int i =0; i < friends.size(); i++){
            System.out.println(friends.get(i));
        }

        // new for
        for (String name : friends){
            System.out.println(name);
        }*/

        // using consumer function

        /*friends.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });*/

        //Replacing the anonymous inner class to the lambda
        //friends.forEach((n) -> System.out.println(n));

        //Replacing the anonymous inner class to the lambda
        friends.forEach(System.out::println);

    }
}
