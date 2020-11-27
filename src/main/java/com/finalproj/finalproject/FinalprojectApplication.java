package com.finalproj.finalproject;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    public static int calc(int a, int b) {
        int result = a * b;
        return  result;
    }

    private final String getMessage() {
        return message;
    }

}
