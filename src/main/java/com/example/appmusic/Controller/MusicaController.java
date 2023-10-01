package com.example.appmusic.Controller;

import com.example.appmusic.Entity.Musica;
import com.example.appmusic.Repository.MusicaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/musica")
public class MusicaController {

    @Autowired
    private MusicaRepo musicaRepo;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewMusic (@RequestParam String nome, @RequestParam Double duracao, @RequestParam String letra) {
        Musica n = new Musica();
        n.setNome(nome);
        n.setDuracao(duracao);
        n.setLetra(letra);
        musicaRepo.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Musica> getAllMusicas() {
        return musicaRepo.findAll();
    }
}
