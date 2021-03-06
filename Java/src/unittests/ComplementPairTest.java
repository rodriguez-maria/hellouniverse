package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import arrays.ComplementPair;

public class ComplementPairTest {

	@Test
	public void testAdd() {
		ComplementPair cp= new ComplementPair(1000);
		cp.add(1);
		cp.add(999);//now result has its 1st entry
		assertTrue(cp.result.get(0).contains(1));
		assertTrue(cp.result.get(0).contains(999));
		cp.add(2);
		cp.add(2);
		cp.add(2);
		cp.add(3);
		cp.add(998);//now result has its 2nd entry
		cp.add(998);//now result has its 3rd entry
		cp.add(997);//now result has its 4th entry
		cp.add(998);//now result has its 5th entry
		cp.add(998);
		cp.add(2);////now result has its 6th entry
		assertTrue(cp.result.get(1).contains(2));
		assertTrue(cp.result.get(1).contains(998));
		assertTrue(cp.result.get(2).contains(2));
		assertTrue(cp.result.get(2).contains(998));
		assertTrue(cp.result.get(3).contains(3));
		assertTrue(cp.result.get(3).contains(997));
		assertTrue(cp.result.get(4).contains(2));
		assertTrue(cp.result.get(4).contains(998));
		assertTrue(cp.result.get(5).contains(2));
		assertTrue(cp.result.get(5).contains(998));
	}

}
