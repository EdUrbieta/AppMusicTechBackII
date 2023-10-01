package com.example.appmusic.Repository;

import com.example.appmusic.Entity.Album;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.appmusic.Entity.Album;
@Repository
public interface AlbumRepo extends CrudRepository<Album, Integer> {
}
