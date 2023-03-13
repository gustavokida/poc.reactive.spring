package com.example.demo.anuncios.domain.entity;

public class AnuncioConsumer {

    public AnuncioConsumer(Integer idAnuncio, String nomeVeiculo, String observacoes, String fotos) {
        this.idAnuncio = idAnuncio;
        this.nomeVeiculo = nomeVeiculo;
        this.observacoes = observacoes;
        this.fotos = fotos;
    }

    private Integer idAnuncio;
    private String nomeVeiculo;
    private String observacoes;
    private String fotos;

    public Integer getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(Integer idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public void setNomeVeiculo(String nomeVeiculo) {
        this.nomeVeiculo = nomeVeiculo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFotos() {
        return fotos;
    }

    public void setFotos(String fotos) {
        this.fotos = fotos;
    }
}
