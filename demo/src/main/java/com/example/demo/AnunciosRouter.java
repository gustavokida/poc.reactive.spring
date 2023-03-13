package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

//@Configuration
public class AnunciosRouter {

    //@Bean
    public RouterFunction<ServerResponse> route(AnunciosHandler handler){
        return RouterFunctions
                .route(GET("/anuncio").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
                .andRoute(GET("/anuncio/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
                .andRoute(POST("/anuncio").and(accept(MediaType.APPLICATION_JSON)), handler::save);
    }

}
