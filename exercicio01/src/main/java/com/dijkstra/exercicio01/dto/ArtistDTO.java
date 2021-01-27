package com.dijkstra.exercicio01.dto;

import java.io.Serializable;

import com.dijkstra.exercicio01.entities.Artist;

public class ArtistDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String nationality;
	
	public ArtistDTO() {}

	public ArtistDTO(Long id, String name, String nationality) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
	}
	
	public ArtistDTO(Artist entity) {
		this.id  = entity.getId();
		this.name = entity.getName();
		this.nationality = entity.getNationality();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
