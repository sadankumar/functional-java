package org.problam;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {

        List<String> wordList = List.of(
                "java", "python", "java", "c++",
                "python", "java", "go", "python",
                "go", "go", "rust");

        //findWordFrequency1(wordList);

        //hashset -> name:salary
        //second highest salary
        Map<String, Integer> employees = new HashMap<>();
        employees.put("jp", 60000);
        employees.put("Amit", 50000);
        employees.put("Ravi", 70000);
        employees.put("Neha", 60000);
        employees.put("Pooja", 70000);
        employees.put("Kiran", 55000);

        getHighestSalary(employees, 3);

    }

    private static void getHighestSalary(Map<String, Integer> employees, int n) {

        Map<Integer, List<Map.Entry<String, Integer>>> collect = employees.entrySet()
                .stream()
                .collect(Collectors.groupingBy(e -> e.getValue()));

        Optional<Map.Entry<Integer, List<Map.Entry<String, Integer>>>> first = collect.entrySet().stream()
                .sorted(Map.Entry.<Integer, List<Map.Entry<String, Integer>>>comparingByKey().reversed())
                .skip(n-1)
                .findFirst();

        first.ifPresent(System.out::println);

//Collections.reverseOrder(e -> e.getKey())
    }

    private static void findWordFrequency(List<String> wordList) {

        HashMap<String, Integer> result = new HashMap<>();

        List<Map.Entry<String, Long>> collect1 = wordList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(collect1);
    }
    private static void findWordFrequency1(List<String> wordList) {

        HashMap<String, Integer> result = new HashMap<>();

        List<Map.Entry<String, Long>> collect = wordList.stream()
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .collect(Collectors.toList());


        System.out.println(collect);
    }
}
