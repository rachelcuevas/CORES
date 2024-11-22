package com.rachel.repositorios;

import com.rachel.modelos.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
	public interface RepositorioArtistas extends CrudRepository<Artista, Long> {
	    List<Artista> findAll();
	}

