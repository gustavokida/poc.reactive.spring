package com.example.demo.anuncios.infra;

import com.example.demo.anuncios.domain.entity.AnuncioConsumer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Anuncio {

    public Anuncio(String id, AnuncioConsumer anuncioConsumer, String status) {
        super();
        this.id = id;
        this.anuncioConsumer = anuncioConsumer;
        this.status = status;
    }

    @Id
    private String id;
    private AnuncioConsumer anuncioConsumer;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AnuncioConsumer getAnuncio() {
        return anuncioConsumer;
    }

    public void setAnuncio(AnuncioConsumer anuncioConsumer) {
        this.anuncioConsumer = anuncioConsumer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
