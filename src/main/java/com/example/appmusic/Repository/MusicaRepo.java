package com.example.appmusic.Repository;

import com.example.appmusic.Entity.Musica;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.appmusic.Entity.Musica;

@Repository
public interface MusicaRepo extends CrudRepository<Musica, Integer> {
}
