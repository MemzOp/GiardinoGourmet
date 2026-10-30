package com.example.giardinogourmet.service;

import com.example.giardinogourmet.entity.Giardino;
import com.example.giardinogourmet.repository.GiardinoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GiardinoService {

    private final GiardinoRepository repository;
    public GiardinoService(GiardinoRepository repository){
        this.repository = repository;
    }

    public List<Giardino> mostrarInformacoes() {
        List<Giardino> giardinoList = new ArrayList<>();
        return giardinoList = repository.findAll();

    }

    public Giardino cadastrarInformacoes(Giardino info) {
        Giardino cardapio = new Giardino();
        cardapio.setNome(info.getNome());
        cardapio.setCategoria(info.getCategoria());
        cardapio.setPreco(info.getPreco());
        cardapio.setTempoPreparo(info.getTempoPreparo());
        cardapio.setServe(info.getServe());
        cardapio.setIngredientes(info.getIngredientes());
        cardapio.setDescricao(info.getDescricao());
        cardapio.setVegetariano(info.isVegetariano());
        cardapio.setDisponivel(info.isDisponivel());
        return repository.save(info);
    }
}
