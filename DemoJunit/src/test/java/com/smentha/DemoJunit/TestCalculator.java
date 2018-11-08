
package com.smentha.DemoJunit;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator  {
	
	 Calculator c=null;
	 
	 @Before
	 public void setUp() {
		 
		 c=new Calculator();
	 }
			
	 
	 @Test
	public void testAdd() {
		 
		 assertEquals(5,c.add(2,3));
		 //method of asset class
		 //static method
		 //takes 2 parameters expected n actual
		
	}

}
