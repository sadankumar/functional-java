package org.sadan.usingcollection.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        friends.forEach(System.out::println);

        //Q: When to use the method reference?
        //A: Makes the lambda expression shorter.
        // Used with direct call with instance or static method
        //we can’t use this convenience if we have to manipulate
        //parameters before sending them as arguments or tinker with the call’s results before returning them.

        // Q: What is method reference ambiguity?
        // A: When you define method, be careful as the overload method can create issue withe the method reference
        // object method and the static method both we can use as method reference

        // Compiler Steps:
        //To decide -> how to route the parameter, the Java compiler will check whether the method
        //is an instance method or a static method.
        //If it’s an instance method, then the synthesized method’s parameter becomes the call’s target
        //On the other hand, if the method is static,
        //then the parameter to the synthesized method is routed as an argument to this method

    }
}
