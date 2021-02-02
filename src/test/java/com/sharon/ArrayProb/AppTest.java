package com.sharon.ArrayProb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	public void testForSizeZeroPair() {
	App pt = new App();
	int [] arr =new int[]{};
	IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->pt.pairAndTripletCount(arr,arr.length,2,false));
	assertEquals("Min 2 elements required for pair",ex.getMessage());
	}
	
	@Test
	public void testForSizeOnePair() {
	App pt = new App();
	int [] arr =new int[]{2};
	IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->pt.pairAndTripletCount(arr,arr.length,2,false));
	assertEquals("Min 2 elements required for pair",ex.getMessage());
	}
	
	@Test
	public void testForSizeZeroTriplet() {
		App pt = new App();
		int [] arr =new int[]{};
		IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->pt.pairAndTripletCount(arr,arr.length,5,true));
		assertEquals("Min 3 elements required for triplet",ex.getMessage());
		}
	@Test
	public void testForSizeOneTriplet() {
		App pt = new App();
		int [] arr =new int[]{1};
		IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->pt.pairAndTripletCount(arr,arr.length,5,true));
		assertEquals("Min 3 elements required for triplet",ex.getMessage());
		}

	@Test
	public void testForSizeTwoTriplet() {
		App pt = new App();
		int [] arr =new int[]{1,2};
		IllegalArgumentException ex=assertThrows(IllegalArgumentException.class,()->pt.pairAndTripletCount(arr,arr.length,5,true));
		assertEquals("Min 3 elements required for triplet",ex.getMessage());
		}
	
	@Test
	public void HappyFlowPair1() {
		App pt = new App();
		int [] arr =new int[]{1, 5, 7, -1, 5};
		assertEquals(1,pt.pairAndTripletCount(arr,arr.length,6,false));
		
	}
	
	@Test
	public void HappyFlowPair2() {
		App pt = new App();
		int [] arr =new int[]{1, 1, -1, -1, 1};
		assertEquals(-1,pt.pairAndTripletCount(arr,arr.length,6,false));
		
	}
	@Test
	public void HappyFlowPair3() {
		App pt = new App();
		int [] arr =new int[]{5, 5, -1, -1, 1};
		assertEquals(1,pt.pairAndTripletCount(arr,arr.length,10,false));
		
	}
	
	@Test
	public void HappyFlowTriplet1() {
		App pt = new App();
		int [] arr =new int[]{0, -1, 2, -3, 1};
		assertEquals(2,pt.pairAndTripletCount(arr,arr.length,-2,true));
		
	}
	@Test
	public void HappyFlowTriplet2() {
		App pt = new App();
		int [] arr =new int[]{1, 1, -1, -1, 1};
		assertEquals(-1,pt.pairAndTripletCount(arr,arr.length,6,true));
		
	}

}
