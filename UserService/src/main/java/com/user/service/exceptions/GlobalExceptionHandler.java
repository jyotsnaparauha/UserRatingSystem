package com.user.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.service.entities.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	//jab bhi ye exception aaye to ye method call hogi
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException exception){
		    String message = exception.getMessage();
		    ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		    return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
}