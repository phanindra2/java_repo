package com.example.servicedemo.exception;

public class EntryAlreadyExistException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EntryAlreadyExistException(String message) {
		super(message);
		
	}

}
