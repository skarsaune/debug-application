package com.example;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;
@SuppressWarnings("unchecked")
public class UninterrestingFramesTest {

	class MyComparator implements Comparator<Comparable<? extends Number>> {

		@Override
		public int compare(Comparable<? extends Number> o1, Comparable<? extends Number> o2) {
			return innerCompare(o1, o2);
		}
		
	}
	
	


	@SuppressWarnings("rawtypes")
	private int innerCompare(Comparable o1, Comparable o2) {
		return o1.compareTo(o2);
	} 
	
	@Test
	public void testWitUninterrestingFrames() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		this.getClass().getDeclaredMethod("calledByReflection").invoke(this);
	}
	
	@SuppressWarnings("unused")
	private void calledByReflection(){
		Collections.sort(Arrays.asList(3,2,1,0), new MyComparator());
	}
}
