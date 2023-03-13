package com.example.demo;

import com.example.demo.anuncios.infra.Anuncio;
import com.example.demo.anuncios.usecase.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;

//@Component
public class AnunciosHandler {

    @Autowired
    AnuncioService service;

    public Mono<ServerResponse> findAll(ServerRequest request){
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findAll(), Anuncio.class);
    }

    public Mono<ServerResponse> findById(ServerRequest request){
        String id = request.pathVariable("id");
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findById(id), Anuncio.class);
    }

    public Mono<ServerResponse> save(ServerRequest request){
        final Mono<Anuncio> anuncio = request.bodyToMono(Anuncio.class);
        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(fromPublisher(anuncio.flatMap(service::save), Anuncio.class));
    }

}
