package com.cg.frs.utility;

public class WrongIdException extends Exception {
	public WrongIdException()
	{
		System.out.println("Owner id is wrong");
	}
}
