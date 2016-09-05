package com.example.domain;

import java.util.HashMap;
import java.util.Map;

public class SimpleCache {

    static Map<String, Simple> cache;

    static {
        cache = new HashMap<>();
        cacheSimple("one");
        cacheSimple("two");
        cacheSimple("three");
        cacheSimple("four");
        cacheSimple("five");
    }

    private static Simple cacheSimple(String name) {
        return cache.put(name, new Simple().setValue(name));
    }


    public static Simple get(String name) {
        return cache.get(name);
    }
}
