package com.dijkstra.exercicio01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dijkstra.exercicio01.dto.ArtistDTO;
import com.dijkstra.exercicio01.entities.Artist;
import com.dijkstra.exercicio01.repositories.ArtistRepository;

@Service
public class ArtistService {
	
	@Autowired
	private ArtistRepository artistRepository;
	
	@Transactional(readOnly = true)
	public Page<ArtistDTO> findAllPaged(PageRequest pageRequest) {
		Page<Artist> list = artistRepository.findAll(pageRequest);
		return list.map(artist -> new ArtistDTO(artist));
	}
}
