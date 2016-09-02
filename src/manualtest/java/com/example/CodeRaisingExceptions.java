package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class CodeRaisingExceptions {
    
    @Test(expected = FileNotFoundException.class)
    public void someCodeThatThrowsException() throws IOException {
        System.out.println("Entering critical section");
        throw new FileNotFoundException("No such file: myfile.txt");
    }
}
