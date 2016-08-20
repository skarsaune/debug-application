package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {

    public static void main(String[] args) throws IOException {
        System.out.println("Type your name");
        final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        final String name=input.readLine();
        System.out.println("Hello, " + name);
    }
}
