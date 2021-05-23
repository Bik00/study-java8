package com.example.java8to11.functionalInterface3;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        /*
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));
         */

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);

        // return (10 * 2) + 10;
        System.out.println(multiply2AndPlus10.apply(10));

        // return (2 + 10) * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));

        Consumer<Integer> printT = (i) -> System.out.println(i);
        printT.accept(10);

        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        Predicate<String> startWithBikoo = (s) -> s.startsWith("Bikoo");
        Predicate<Integer> isOdd = (i) -> i % 2 == 1;
        Predicate<Integer> isEven = (i) -> i % 2 == 0;

        UnaryOperator<Integer> plus5 = (i) -> i + 5;

    }
}
