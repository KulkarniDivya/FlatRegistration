package com.cg.frs.utility;

public class WrongFlatTypeException extends Exception {
	public WrongFlatTypeException()
	{
		System.out.println("Flat_Type should be 1 for 1BHK and 2 for 2BHK");
	}
}
