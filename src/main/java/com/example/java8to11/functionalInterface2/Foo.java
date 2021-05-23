package com.example.java8to11.functionalInterface2;

public class Foo {

    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        /*
        RunSomething runSomething = new RunSomething() {
            @Override
            public int doIt(int number) {
                return number + 10;
            }
        };

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(3));
        System.out.println(runSomething.doIt(4));
        */

        // 람다식 (일반)
        /*
        RunSomething runSomething = number -> {
            return number + 10;
        };

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(3));
        System.out.println(runSomething.doIt(4));
        */

        // 람다식 (1줄 전용)
        RunSomething runSomething = number -> number + 10;

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(2));
        System.out.println(runSomething.doIt(3));
        System.out.println(runSomething.doIt(4));
    }
}
