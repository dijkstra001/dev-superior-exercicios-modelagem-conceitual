package com.dijkstra.exercicio01.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dijkstra.exercicio01.entities.Artist;
import com.dijkstra.exercicio01.repositories.ArtistRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	ArtistRepository artistRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Artist artist1 = new Artist(null, "Ana Maria", "Brazilian");
		Artist artist2 = new Artist(null, "João de Souza", "Brazilian");
		Artist artist3 = new Artist(null, "Carl Marx", "Russian");
		Artist artist4 = new Artist(null, "Miriam Burder", "German");
		Artist artist5 = new Artist(null, "Luiz Del Castro", "Spanish");
	
		artistRepository.saveAll(Arrays.asList(artist1, artist2, artist3, artist4, artist5));
	}

}
