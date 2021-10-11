import dao.AnuncioPersistence;
import dao.VendedorPersistence;
import entity.Anuncio;
import entity.Vendedor;
import service.AnuncioService;
import service.VendedorService;

import java.math.BigDecimal;
import java.time.LocalDate;


public class MainAnuncio {
    public static void main(String[] args) {

        VendedorPersistence vendedorPersistence = new VendedorPersistence(); //like a mock :)
        VendedorService vendedorService = new VendedorService(vendedorPersistence);

        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
        AnuncioService anuncioService = new AnuncioService(anuncioPersistence, vendedorService);

        Vendedor vendedor = vendedorPersistence.getVendedor("MLB220");
        anuncioService.insere(new Anuncio("Caneta esferográfica", new BigDecimal(5), LocalDate.now(), "50", vendedor));
    }
}
