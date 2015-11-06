package com.labouardy.exception;

public class RoverStuckException extends Exception{
	private static final long serialVersionUID = 1L;

	public RoverStuckException(String msg){
		super(msg);
	}
}
