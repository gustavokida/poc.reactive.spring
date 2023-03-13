package com.example.demo.anuncios.usecase;

import com.example.demo.anuncios.infra.Anuncio;
import com.example.demo.anuncios.repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AnuncioServiceImpl implements AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @Override
    public Flux<Anuncio> findAll() {
        return anuncioRepository.findAll();
    }

    @Override
    public Mono<Anuncio> findById(String id) {
        return anuncioRepository.findById(id);
    }

    @Override
    public Mono<Anuncio> save(Anuncio anuncio) {
        return anuncioRepository.save(anuncio);
    }
}
