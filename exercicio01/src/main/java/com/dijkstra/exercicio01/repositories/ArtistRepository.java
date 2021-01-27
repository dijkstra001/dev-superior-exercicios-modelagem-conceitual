package com.dijkstra.exercicio01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dijkstra.exercicio01.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{

}
