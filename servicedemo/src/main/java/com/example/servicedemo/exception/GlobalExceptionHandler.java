package com.example.servicedemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = EntryNotFoundException.class)
	public ResponseEntity<String> handleEntryNotFound(EntryNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(value = EntryAlreadyExistException.class)
	public ResponseEntity<String> handleEntryAllReadyExist(EntryAlreadyExistException ex){
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.BAD_REQUEST);	
	}
//	@ExceptionHandler(value =Exception.class)
//	public ResponseEntity<String> handleGeneric(Exception ex){
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred: " + ex.getMessage());
//	}

}
