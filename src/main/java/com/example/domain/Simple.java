package com.example.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simple {
    private static Logger logger = LoggerFactory.getLogger(Simple.class);

    private String value="default";


    public String getValue() {
        return value;
    }

    public Simple setValue(String value) {
        this.value = value;
        return this;
    }
}
