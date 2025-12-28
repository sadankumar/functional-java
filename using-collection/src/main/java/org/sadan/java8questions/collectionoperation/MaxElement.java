package org.sadan.java8questions.collectionoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(7,9,5,1,7,4,12);
        List<Integer> nums1 =Arrays.asList();

        Optional<Integer> max = nums.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());

        //if the list is empty, the optional get will throw exception
        /*Optional<Integer> max1 = nums1.stream()
                .max(Integer::compareTo);
        System.out.println(max1.get());*/

        // Solution:
        Integer maxInt = nums1.stream()
                .max(Integer::compareTo)
                .orElse(-1);
        System.out.println(maxInt);


    }
}
