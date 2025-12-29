package org.sadan.java8questions.bookreference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdvanceTricks {
    public static void main(String[] args) {

        //Check if list is sorted
        List<Integer> list = Arrays.asList(2, 7, 18, 5, 9, 4, 12, 3, 2,4,2,2, 10);
        isListSorted(list);

        //Find second highest
        secondHighest(list);

        //Second lowest
        secondLowest(list);

        //palindrome check
        // -> reverse then check equality
        String str = "bangnab";
        isPalindrome(str);

        // group words by length
        List<String> names = List.of("Kim", "milly", "Jim", "sim", "kelly");
        groupByLength(names);

        //word frequency count
        List<String> names1 = List.of("Kim", "milly", "Jim","kim","kim", "sim","jim", "kelly");
        wordFrequency(names1);
        
        //Top 3 frequent word
        top3FrequentWord(names1);
        top3FrequentWordFrequency(names1);
    }

    private static void top3FrequentWordFrequency(List<String> names1) {
        List<String> words = List.of(
                "apple", "banana", "apple", "orange", "banana",
                "apple", "grape", "banana", "orange"
        );

        Map<String, Long> top3 =
                names1.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                        .limit(3)
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue
                        ));

        System.out.println(top3);

    }

    private static void top3FrequentWord(List<String> names1) {
        List<String> list1 = names1.stream()
                .collect(Collectors.groupingBy(s -> s.toUpperCase(),
                        Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
        // .collect(Collectors.toMap())
        System.out.println(list1);
    }

    private static void wordFrequency(List<String> names1) {
        Map<String, Long> freqMap = names1.stream()
                .collect(Collectors.groupingBy(
                        s -> s.toUpperCase(),
                        Collectors.counting()
                ));
        freqMap.forEach((k,v)-> System.out.println(k + ":" + v));
    }

    private static void groupByLength(List<String> names) {
        Map<Integer, List<String>> lenMap = names.stream()
                .collect(Collectors.groupingBy(String::length));
        lenMap.forEach((k,v)-> System.out.println(k+":"+v));

    }

    private static void isPalindrome(String str) {
        boolean isPalindrome = str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
        System.out.println("isPalindrome:"+isPalindrome);
    }

    private static void secondLowest(List<Integer> list) {
        Integer secondLowest = list.stream()
                .sorted(Comparator.naturalOrder())
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondLowest);
    }

    private static void secondHighest(List<Integer> list) {
        Integer secondHighest = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println(secondHighest);
    }

    private static void isListSorted(List<Integer> list) {
        boolean isSorted = IntStream.range(0, list.size() - 1)
                .allMatch(i -> list.get(i) <= list.get(i + 1));
        System.out.println(isSorted);
    }
}
