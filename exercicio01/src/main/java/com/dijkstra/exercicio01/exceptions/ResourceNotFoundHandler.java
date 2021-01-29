package com.dijkstra.exercicio01.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceNotFoundHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		StandardError standardError = new StandardError();
		HttpStatus status = HttpStatus.NOT_FOUND;
		standardError.setError("Resource not found.");
		standardError.setMessage(e.getMessage());
		standardError.setStatus(status.value());
		standardError.setTimestamp(Instant.now());
		standardError.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(standardError);
	}
}
