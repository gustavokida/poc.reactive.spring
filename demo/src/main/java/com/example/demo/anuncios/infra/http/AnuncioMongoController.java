package com.example.demo.anuncios.infra.http;

import com.example.demo.anuncios.infra.Anuncio;
import com.example.demo.anuncios.usecase.AnuncioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/anuncio")
public class AnuncioMongoController {

    @Autowired
    AnuncioService anuncioService;

    @GetMapping()
    public Flux<Anuncio> getAnuncio(){
        return anuncioService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Anuncio> getAnuncioId(@PathVariable String id){
        return anuncioService.findById(id);
    }

    @PostMapping(value = "/anuncioMongo")
    public Mono<Anuncio> saveAnuncio(@RequestBody Anuncio anuncio){
        return anuncioService.save(anuncio);
    }


    @GetMapping(value = "/fluxo")
    private  Flux<Tuple2<Long, Anuncio>> getAnunciosByEvents(){
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
        Flux<Anuncio> events = anuncioService.findAll();
        Thread test = new Thread();
        System.out.println(test.getName());
        return Flux.zip(interval, events);
    }

    @GetMapping(value = "/test")
    private List<String> getAnuncios() throws InterruptedException {
        List<String> strings = new ArrayList<>();
        strings.add("teste");
        strings.add("teste1");
        strings.add("teste2");
        strings.add("teste3");
        TimeUnit.SECONDS.sleep(5);
        Thread test = new Thread();
        System.out.println(test.threadId());
        return strings;
    }


}
