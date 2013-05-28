package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import project_euler.EvenFibonacciSum;

public class EvenFibonacciSumTest {

	@Test
	public void testCalculate() {
		assertEquals(10, new EvenFibonacciSum(14).calculate());
		System.out.println(new EvenFibonacciSum(4000000).calculate());
	}

}
