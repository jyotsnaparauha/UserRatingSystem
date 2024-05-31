package com.hotel.exception;

public class ResourceNotFoundException extends RuntimeException{
 public ResourceNotFoundException(String msg) {
	 super(msg);
 }
 public ResourceNotFoundException() {
	// TODO Auto-generated constructor stub
	 super("Resource not found exception");
}
}
