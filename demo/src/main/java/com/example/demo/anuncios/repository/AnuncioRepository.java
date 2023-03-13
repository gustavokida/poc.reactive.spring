package com.example.demo.anuncios.repository;

import com.example.demo.anuncios.infra.Anuncio;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnuncioRepository extends ReactiveMongoRepository<Anuncio, String> {


}
