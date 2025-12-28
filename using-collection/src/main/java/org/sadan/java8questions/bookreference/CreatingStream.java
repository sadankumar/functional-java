package org.sadan.java8questions.bookreference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) throws IOException {

        //Q: what are the ways to create the streams
        //Stream from values
        Stream<String> values = Stream.of("Ken", "", "Jeff", "Al", "Ellen", "Jammie");
        System.out.println(values);
        // Types of streams
        //1. Creating Stream from values:
        // String,Integer, Double, Long
        // Range
        Stream<Integer> intStream = Stream.of(1,8,5,9,3,2,1,3,7,3);
        System.out.println(intStream);
        Stream<? extends Number> numStream = Stream.of(1, 8, 5, 9, 3, 2, 1, 3, 7, 3.5);
        System.out.println(numStream);
        System.out.println(numStream.getClass().getSimpleName());
        //Range : range and rangeClosed function
        //IntStream.range(1,10).forEach(System.out::println);
        //IntStream.rangeClosed(1,10).forEach(System.out::println);

        //Create stream from function
        //Stream.iterate(1,n->n+2).limit(5).forEach(System.out::println);
        //Stream.generate(Math::random).limit(10).forEach(System.out::println);
        //Stream.generate(()-> new Random().nextInt(100)).limit(10).forEach(System.out::println);

        //Stream from Arrays:
        int[] vals = new int[]{1,8,7,4,3};
        int sum = Arrays.stream(vals).sum();
        //System.out.println("sum:"+sum);

        //Stream from Collections
        // Create and populate a set of strings
        Set<String> names = new HashSet<>();
        names.add("Ken");
        names.add("jeff");
        // Create a sequential stream from the set
        Stream<String> sequentialStream = names.stream();
        Stream<String> parallelStream = names.parallelStream();
        System.out.println("sequentialStream:"+sequentialStream);
        System.out.println("parallelStream:"+parallelStream);

        //Stream from files
        //Stream<String> lines = Files.lines(Path.of("D:\\java_project\\rel.txt"));
        //lines.forEach(str-> System.out.println(str));


    }
}
