package com.example;

import org.junit.Test;

import com.example.domain.Simple;
import com.example.domain.SimpleCache;

public class TestInstancesAndCreation {

	@Test
    public void monitorClassAndInstances() throws ReflectiveOperationException {
        Simple someObject=SimpleCache.get("one");
        SimpleCache.get("two").setValue("newValueForTheOtherGuy");
        someObject.setValue("newValue");
    }
}
