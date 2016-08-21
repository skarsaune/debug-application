package com.example;

import org.junit.Test;

import java.util.Random;

public class ChangeFlowTest {

    public static final int LIMIT = 100;

    @Test
    public void test1ModifyByChangingValue() {
        final boolean valid = this.isValid();
        if(valid) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }

    private boolean isValid() {
        return new Random().nextBoolean();
    }

    @Test
    public void test2ModifyByForceReturnVoid() {
        try {
            validate();
        } catch(Throwable t) {
            System.err.println("Validation failed : " + t.getMessage());
        }
    }

    @Test
    public void test3ModifyByForceReturnValue() {
        if(this.calculate() > LIMIT){
            System.out.println("sufficient");
        } else {
            System.out.println("not enough");
        }
    }

    private int calculate() {
        return new Random().nextInt(200);
    }

    private void validate() {
        if(!isValid()) {
            throw new IllegalArgumentException("Not valid");
        }
    }


    @Test
    public void test4BySimulatingException() {
        try {
            validate();
        } catch(Throwable t) {
            System.err.println("Validation failed : " + t.getMessage());
        }
    }



}
