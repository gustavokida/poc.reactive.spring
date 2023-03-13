package com.example.demo.anuncios.usecase;

import com.example.demo.anuncios.infra.Anuncio;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AnuncioService {

    Flux<Anuncio> findAll();

    Mono<Anuncio> findById(String id);

    Mono<Anuncio> save(Anuncio anuncio);

}
