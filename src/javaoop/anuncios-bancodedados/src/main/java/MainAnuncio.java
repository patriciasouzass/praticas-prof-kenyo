import dao.AnuncioPersistence;
import dao.VendedorPersistence;
import entity.Anuncio;
import entity.Endereco;
import entity.Vendedor;
import service.AnuncioService;
import service.VendedorService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


public class MainAnuncio {

    public static void main(String[] args) {

        insereAnuncio();
//        atualizaAnuncio();
//        deleta();
    }

    private static void insereAnuncio(){

        AnuncioPersistence anuncioPersistence = new AnuncioPersistence(); //like a mock :)
        Vendedor vendedor = new Vendedor("MLB220", "123.487.512-45", "Chris");

        List<Endereco> enderecos = Arrays.asList(new Endereco("15421-010", "Rua Jacutinga", "Lote 10", 12, "RJ", "Rio de Janeiro", vendedor));

        vendedor.setEnderecos(enderecos);

        Anuncio anuncio = new Anuncio("MLB335", "Mesa de Som JBL", new BigDecimal(10.000), LocalDate.now(), 3, vendedor);

        anuncioPersistence.insere(anuncio);
    }
}
