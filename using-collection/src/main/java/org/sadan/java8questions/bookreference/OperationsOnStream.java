package org.sadan.java8questions.bookreference;

import java.util.stream.IntStream;

public class OperationsOnStream {
    public static void main(String[] args) {
        addSquareOfOddNumbers();
    }

    public static void addSquareOfOddNumbers(){
        int sum = IntStream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 1)
                .map(n -> n*n)
                .sum();
        System.out.println(sum);

        int reduce = IntStream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(reduce);

    }
}

/*class Test{
    public void addSquareOfOddNumbers(){
        int reduce = IntStream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 1)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
    }
}*/
