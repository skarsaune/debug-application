package com.example;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class TestViewingStructures {

    @Test
    public void testViewingStructures() {
        Map<?, ?> map = createMap();
        List<?> list = createList();
        System.out.println("map: " + map + ", list: " + list);
    }

    private List<?> createList() {
        LinkedList<Object> list = new LinkedList<Object>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        return list;
    }

    private Map<?,?> createMap() {
        return new TreeMap<>(System.getProperties());
    }
}
