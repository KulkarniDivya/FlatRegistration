package com.cg.frs.utility;

public class WrongFlatAreaException extends Exception {
	public WrongFlatAreaException()
	{
		System.out.println("Flat Area can never be negative or 0");
	}
}
