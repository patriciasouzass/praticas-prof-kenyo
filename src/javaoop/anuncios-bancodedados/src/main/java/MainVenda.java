import dao.AnuncioPersistence;
import dao.VendaPersistence;
import dao.VendedorPersistence;
import entity.Anuncio;
import entity.FormaPagamento;
import entity.Venda;
import entity.Vendedor;
import service.VendaService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MainVenda {

    public static void main(String[] args) {
        VendedorPersistence vendedorPersistence = new VendedorPersistence();
        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
        VendaPersistence vendaPersistence = new VendaPersistence();

        Vendedor vendedor = vendedorPersistence.getVendedor("MLB220");
        Anuncio anuncio = anuncioPersistence.getAnuncio("ML3");

        VendaService vendaService= new VendaService(vendaPersistence);
        vendaPersistence.insere(new Venda(LocalDate.now(), new BigDecimal(40), FormaPagamento.A_VISTA, vendedor, anuncio));

    }
}
