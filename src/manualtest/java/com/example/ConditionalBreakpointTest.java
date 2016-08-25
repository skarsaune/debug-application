package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class ConditionalBreakpointTest {
	


	@Test
	public void testPerformance() {
		
		final List<Object> randomList = Arrays.asList(1, 1.0, 'a', "Yes", new Lock());
		int hitCount=0;
		for(int i=0;i<1_000; i++) {
			Object pick = randomList.get(new Random().nextInt(randomList.size()));
			if(pick == "Yes") {
				hitCount++;
			}
		}
		System.out.println("Encountered Yes " + hitCount + " times");
		
	}

}
