package com.example;

import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 */
public class TestViewingStructures {

    @Test
    public void testViewingStructures() throws Exception {
        Map<?, ?> map = createMap();
        List<?> list = createList();
        Document document = parsePom();
        System.out.println("map: " + map + ", list: " + list + " document: " + document);
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
    
    private Document parsePom() throws Exception {
    	return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("pom.xml"));
    }
}
