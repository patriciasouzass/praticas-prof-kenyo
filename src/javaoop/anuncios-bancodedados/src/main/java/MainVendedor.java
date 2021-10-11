import dao.VendedorPersistence;
import entity.Endereco;
import entity.Vendedor;
import service.VendedorService;

import java.util.Arrays;
import java.util.List;

public class MainVendedor {

    public static void main(String[] args) {

        VendedorPersistence vendedorPersistence = new VendedorPersistence();
        Vendedor vendedor = new Vendedor("141.157.178-74", "Cleiton");
        List<Endereco> novoEndereco = Arrays.asList(new Endereco("15415-547", "Rua Postinho", "Casa 7", 145, "RJ", "Rio das Ostras", vendedor));

        VendedorService vendedorService = new VendedorService(vendedorPersistence);

        vendedor.setEnderecos(novoEndereco);
        vendedorService.insere(vendedor);
    }

}
