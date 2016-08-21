package com.example;

import java.util.Arrays;

import org.junit.Test;

import static java.lang.System.out;

public class LambdaTest {

	@Test
	public void test() {
		System.out.println("Line before lambda");
		Arrays.asList(1,2,3).forEach(each -> out.println("item: "  + each));
		System.out.println("Line after lambda");
	}
	
	@Test
	public void testStream() {
 		Arrays.asList(1,2,3,4,5).stream().filter(num -> (Integer.remainderUnsigned(num, 2) == 0)).map(even -> Integer.sum(even, 1)).forEach(odd -> System.out.println(odd));
	}

}
