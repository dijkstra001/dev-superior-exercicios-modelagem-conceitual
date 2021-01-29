package com.dijkstra.exercicio01.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dijkstra.exercicio01.dto.ArtistDTO;
import com.dijkstra.exercicio01.services.ArtistService;

@RestController
@RequestMapping(value = "/artists")
public class ArtistResource {
	
	@Autowired
	private ArtistService artistService;
	
	@GetMapping
	public ResponseEntity<Page<ArtistDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<ArtistDTO> list = artistService.findAllPaged(pageRequest);
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ArtistDTO> findById(@PathVariable  Long id){
		ArtistDTO artist = artistService.findById(id);
		return ResponseEntity.ok().body(artist);
	}
}
