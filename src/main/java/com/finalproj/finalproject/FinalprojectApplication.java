package com.finalproj.finalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class FinalprojectApplication {

    private final String message = "Hello World!";

    public FinalprojectApplication() {}

    public static void main(String[] args) {
	SpringApplication.run(FinalprojectApplication.class, args);
    }

    public static void main(String[] args) {
        System.out.println(new FinalprojectApplication().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
