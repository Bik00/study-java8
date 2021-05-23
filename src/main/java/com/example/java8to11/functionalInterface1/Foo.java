package com.example.java8to11.functionalInterface1;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        // 람다식 (일반)
        RunSomething runSomething2 = () -> {
            System.out.println("Hello");
            System.out.println("lamda");
        };

        // 람다식 (1줄 전용)
        RunSomething runSomething3 = () -> System.out.println("Hello");

        // 함수형 인터페이스 실행
        runSomething.doIt();

        // 마치 함수를 정의한 것 처럼 보여준다.
    }
}
