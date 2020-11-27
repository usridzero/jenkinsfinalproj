package com.finalproj.finalproject;

/**
 * Hello world!
 */
@SpringBootApplication
public class FinalprojectApplication {

    private final String message = "Hello World!";

    public FinalprojectApplication() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
