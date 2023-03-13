package com.example.demo;

//@Component
//public class DummyData implements CommandLineRunner {
//
//    private final AnuncioRepository anuncioRepository;
//    private final Anuncio anuncio1 = new Anuncio(1 , "Prisma LTZ", "Automatico", "Foto do Motor");
//    private final Anuncio anuncio2 = new Anuncio(2 , "Onix LTZ", "Automatico", "Foto do vidro");
//    private final Anuncio anuncio3 = new Anuncio(3 , "S10 LTZ", "Manual", "Foto da porta");
//    private final Anuncio anuncio4 = new Anuncio(4 , "Cobalt LTZ", "Manual", "Foto do pneu");
//
//    public DummyData(AnuncioRepository anuncioRepository) {
//        this.anuncioRepository = anuncioRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        anuncioRepository.deleteAll()
//                .thenMany(
//                        Flux.just(anuncio1, anuncio2, anuncio3, anuncio4)
//                                .map(anuncio -> new AnuncioMongo(UUID.randomUUID().toString(), anuncio, "PENDENTE"))
//                                .flatMap(anuncioRepository::save))
//                .subscribe(System.out::println);
//    }
//}
