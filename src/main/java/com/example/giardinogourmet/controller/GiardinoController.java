package com.example.giardinogourmet.controller;


import com.example.giardinogourmet.entity.Giardino;
import com.example.giardinogourmet.service.GiardinoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pratos")
public class GiardinoController {

    private final GiardinoService service;
    public GiardinoController(GiardinoService service){
        this.service = service;
    }

    @GetMapping
    public List<Giardino> mostraInformacoes(){
        return service.mostrarInformacoes();
    }

    @PostMapping
    public void criarServico (@RequestBody Giardino g){
        service.cadastrarInformacoes(g);
    }
}

