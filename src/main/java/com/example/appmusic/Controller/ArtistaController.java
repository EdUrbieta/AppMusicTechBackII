package com.example.appmusic.Controller;

import com.example.appmusic.Entity.Artista;
import com.example.appmusic.Repository.ArtistaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/artista")
public class ArtistaController {

    @Autowired
    private ArtistaRepo artistaRepo;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewArtista (@RequestParam String nome, @RequestParam String genero) {
        Artista n = new Artista();
        n.setNome(nome);
        n.setGenero(genero);
        artistaRepo.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Artista> getAllArtistas() {
        return artistaRepo.findAll();
    }
}
