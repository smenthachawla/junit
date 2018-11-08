package com.smentha.DemoJunit;

public class Calculator {
	
	CalculatorService service;
	
	public int add(int i,int j) {
		
		return service.add(i, j);
		//return i+j;
		
		
	}

}
