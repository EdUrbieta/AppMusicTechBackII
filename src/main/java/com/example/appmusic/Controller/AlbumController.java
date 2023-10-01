package com.example.appmusic.Controller;

import com.example.appmusic.Entity.Album;
import com.example.appmusic.Repository.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/album")
public class AlbumController {

    @Autowired
    private AlbumRepo albumRepo;

    @PostMapping(path="/add")
    public @ResponseBody String addNewAlbum (@RequestParam String nome, @RequestParam Double duracao) {
        Album n = new Album();
        n.setNome(nome);
        n.setDuracao(duracao);
        albumRepo.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Album> getAllAlbums() {
        return albumRepo.findAll();
    }
}
