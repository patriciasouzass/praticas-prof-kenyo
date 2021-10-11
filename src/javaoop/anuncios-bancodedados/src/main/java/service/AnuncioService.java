package service;

import dao.AnuncioPersistence;
import entity.Anuncio;

import java.util.concurrent.ThreadLocalRandom;

public class AnuncioService {

    private AnuncioPersistence anuncioPersistence;
    private VendedorService vendedorService;

    public AnuncioService() {
    }

    public AnuncioService(AnuncioPersistence anuncioPersistence, VendedorService vendedorService) {
        this.anuncioPersistence = anuncioPersistence;
        this.vendedorService = vendedorService;
    }

    private String codigoUnico(){
        return "MLB" + ThreadLocalRandom.current().nextInt(100, 999);
    }

    public void insere(Anuncio anuncio){
        if (anuncio.getVendedor() == null){
            throw new RuntimeException("Anuncio precisa estar associado a um vendedor.");
        } else {
            anuncio.setCodigo(codigoUnico());
            anuncioPersistence.insere(anuncio);
        }
    }
}
