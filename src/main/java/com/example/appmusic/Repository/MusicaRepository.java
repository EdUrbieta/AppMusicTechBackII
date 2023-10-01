package com.example.appmusic.Repository;

import com.example.appmusic.Entity.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Long> {
    Optional<Musica> findAllById(long id);
}
