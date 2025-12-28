package org.sadan.java8questions.collectionoperation;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {

        //Reverse/descending sort and join
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Graps");
        descendingOrderWithJoin(fruits);

        //Sorting of custom object Person: TODO

        //Remove duplicate and sort the intergers
        List<Integer> nums = Arrays.asList(2,8,12,4,7,6,5,4,314,11,12);
        removeDupAndReverseSort(nums);

        //Flatten nested list
        List<List<Integer>> listNum = Arrays.asList(
          Arrays.asList(2,4,5),
          Arrays.asList(1,3,6),
          Arrays.asList(6,8,8)
        );
        flattenList(listNum);
        flattenListImproved(listNum);
        flattenListAndSort(listNum);
    }

    private static void flattenListImproved(List<List<Integer>> listNum) {
        List<Integer> flatList = listNum.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatList);
    }


    private static void flattenList(List<List<Integer>> listNum) {
        List<Integer> flatList = listNum.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
    private static void flattenListAndSort(List<List<Integer>> listNum) {
        List<Integer> flatList = listNum.stream()
                .flatMap(list -> list.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(flatList);
    }

    private static void removeDupAndReverseSort(List<Integer> nums) {
        List<Integer> sortedNums = nums.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("nums:"+ nums);
        System.out.println("sortedNums:"+sortedNums);
    }

    private static void descendingOrderWithJoin(List<String> fruits) {
        String result = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));
        System.out.println(result);
    }
}
