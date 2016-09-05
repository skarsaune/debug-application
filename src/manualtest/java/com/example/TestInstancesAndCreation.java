package com.example;

import java.lang.reflect.Field;

import org.junit.Test;

import com.example.domain.Simple;
import com.example.domain.SimpleCache;

public class TestInstancesAndCreation {

	@Test
    public void monitorClassAndInstances() throws ReflectiveOperationException {
        Simple someObject=SimpleCache.get("one");
        someObject.setValue("newValue");
        System.out.println(someObject.getValue());


    }




}
