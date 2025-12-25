package org.sadan.stringoperation;

public class IterateString {
    public static void main(String[] args) {

        String name = "sadan007";

        /*name.chars()
                .forEach(c -> System.out.println(c));*/
        // Oops it's print integer.
        // chars() produces the IntStream -> yhe ASCII is getting printer
        // we need to cast

        /*name.chars()
                .forEach(c -> System.out.println((char)c));*/

        //Q: what is the other way to achieve this?
        // map function

        /*name.chars()
                .mapToObj(c -> (char)c)
                .forEach(System.out::println);*/

        name.chars()
                .filter(Character::isDigit)
                .forEach(c -> System.out.println((char)c));

        // we can create separate method for casting to char and use the method reference

        //
    }
}
