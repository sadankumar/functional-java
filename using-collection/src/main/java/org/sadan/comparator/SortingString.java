package org.sadan.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingString {
    public static void main(String[] args) {
        /*List<String> myShoppingList = new ArrayList<String>( );
        myShoppingList.add("Cereal");
        myShoppingList.add("Apples");
        myShoppingList.add("Soap");
        myShoppingList.add("Brush");
        System.out.println("Before sorting: " + myShoppingList);
        // invokes compareTo method implemented in the String class.
        Collections.sort(myShoppingList);
        System.out.println("After sorting: " + myShoppingList);*/


        scenario1(); // i want to implement name length comparator
    }

    private static void scenario1() {
        List<String> myShoppingList = new ArrayList<String>( );
        myShoppingList.add("Cereal");
        myShoppingList.add("Apples");
        myShoppingList.add("Soap");
        myShoppingList.add("Brush");
        myShoppingList.add(null);

        System.out.println("Before sorting: " + myShoppingList);
        // invokes compareTo method implemented in the String class.
        //Collections.sort(myShoppingList);//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Comparable.compareTo(Object)" because "pivot" is null

        // Solution: Use inplace comparator interface: name length comparator
        Collections.sort(myShoppingList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //Handling null
                if(o1 == null){
                    o1 = "";
                }
                if(o2 == null){
                    o2 = "";
                }

                return o1.length() - o2.length(); //
                //return new Integer(o1.length()).compareTo(o2.length());
            }
        });


        System.out.println("After sorting: " + myShoppingList);
    }
}
