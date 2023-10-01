package com.example.appmusic.Repository;

import com.example.appmusic.Entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.appmusic.Entity.Artista;

@Repository
public interface ArtistaRepo extends CrudRepository<Artista, Integer> {
}
