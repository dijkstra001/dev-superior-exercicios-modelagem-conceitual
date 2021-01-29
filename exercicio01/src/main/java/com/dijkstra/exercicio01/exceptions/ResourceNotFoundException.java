package com.dijkstra.exercicio01.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Long id) {
		super("O id "+id+" não foi encontrado.");
	}
	

}
