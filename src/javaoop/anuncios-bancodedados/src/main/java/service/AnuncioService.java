package service;

import dao.AnuncioPersistence;
import entity.Anuncio;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class AnuncioService {

    private AnuncioPersistence anuncioPersistence;
//    private VendedorService vendedorService;

    public AnuncioService(AnuncioPersistence anuncioPersistence) {
        this.anuncioPersistence = anuncioPersistence;
    }

//    public AnuncioService(AnuncioPersistence anuncioPersistence, VendedorService vendedorService) {
//        this.anuncioPersistence = anuncioPersistence;
//        this.vendedorService = vendedorService;
//    }

    private String codigoUnico(){
        return "MLB" + ThreadLocalRandom.current().nextInt(100, 999);
    }

    public void insere(Anuncio anuncio){
        if (anuncio.getCodigo() == null || anuncio.getCodigo().isEmpty()){
            anuncioPersistence.insere(anuncio);
        } else {
            Anuncio anuncioExistente = anuncioPersistence.getAnuncio(anuncio.getCodigo());

            if (anuncioExistente == null){
                throw new RuntimeException("Anuncio precisa estar associado a um vendedor.");
            }

            anuncioExistente.setPreco(new BigDecimal(24000));
            anuncioExistente.setTitulo("Mesa de Som JBL");
            anuncioPersistence.atualiza(anuncioExistente);
        }
    }
}
