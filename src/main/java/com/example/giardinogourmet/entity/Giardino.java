package com.example.giardinogourmet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Giardino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private Categoria categoria;
    private double preco;
    private int tempoPreparo;
    private int serve;
    private String ingredientes;
    private String descricao;
    private boolean vegetariano;
    private boolean disponivel;

    public Giardino() {
    }


    public Giardino(String nome, Categoria categoria, double preco, int tempoPreparo, int serve, String ingredientes, String descricao, boolean vegetariano, boolean disponivel) {

        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.serve = serve;
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.vegetariano = vegetariano;
        this.disponivel = disponivel;
    }

    public Giardino(long id, String nome, Categoria categoria, double preco, int tempoPreparo, int serve, String ingredientes, String descricao, boolean vegetariano, boolean disponivel) {

        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.serve = serve;
        this.ingredientes = ingredientes;
        this.descricao = descricao;
        this.vegetariano = vegetariano;
        this.disponivel = disponivel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getServe() {
        return serve;
    }

    public void setServe(int serve) {
        this.serve = serve;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}


