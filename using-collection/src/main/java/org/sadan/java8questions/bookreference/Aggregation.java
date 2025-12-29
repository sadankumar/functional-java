package org.sadan.java8questions.bookreference;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Aggregation {
    public static void main(String[] args) {
        //sum of even numbers
        int[] nums = new int[] {2,7,8,5,9,4,3,3,2,1};
        sumOfEven(nums);

        List<Integer> list = Arrays.asList(2, 7, 8, 5, 9, 4, 3, 3, 2, 1);
        System.out.println(list);
        sumOfEven(list);

        // Average of numbers > 10
        List<Integer> list1 = Arrays.asList(2, 7, 18, 5, 9, 4, 12, 3, 2,4,2,2, 10);
        avgOfNumGreaterThanGivenNum(list1,10);
        
        //Frequency count
        freqCount(list1);

        // What are the diff overrides for the Collectors.groupingBy


        //

    }

    private static void freqCount(List<Integer> list1) {
        Map<Integer, Long> map= list1.stream()
                .collect(Collectors.groupingBy(
                        n->n,
                        Collectors.counting()
                ));
        map.forEach((k,v)-> System.out.println(k + ":" + v));
    }

    private static void avgOfNumGreaterThanGivenNum(final List<Integer> list1, final int num) {
        double avgVal = list1.stream()
                .filter(n -> n > num)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-1);

        System.out.println(avgVal);
    }

    private static void sumOfEven(List<Integer> list) {
        int sum = list.stream()
                .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::valueOf)
                                .sum();
                        //.reduce(0, Integer::sum);
        System.out.println(sum);
    }
    private static void sumOfEven(int[] nums) {
        int sum = Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
