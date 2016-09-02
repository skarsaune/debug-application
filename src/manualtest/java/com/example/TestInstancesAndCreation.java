package com.example;

import com.example.domain.Simple;
import com.example.domain.SimpleCache;
import org.junit.Test;

import java.util.Properties;

public class TestInstancesAndCreation {

    @SuppressWarnings("unused")
	@Test
    public void monitorClassAndInstances() {
        Simple someObject=SimpleCache.get("one");
        Properties veryImportantObject=System.getProperties();
        String ls=veryImportantObject.getProperty("line.separator");

    }




}
