package service;

import dao.VendedorPersistence;
import entity.Endereco;
import entity.Vendedor;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class VendedorService {
    private VendedorPersistence vendedorPersistence;
    private Endereco endereco;

    public VendedorService(VendedorPersistence vendedorPersistence) {
        this.vendedorPersistence = vendedorPersistence;
    }

    public VendedorService(VendedorPersistence vendedorPersistence, Endereco endereco) {
        this.vendedorPersistence = vendedorPersistence;
        this.endereco = endereco;
    }

    private String codigoUnico() {
        return "MLB" + ThreadLocalRandom.current().nextInt(100, 999);
    }

    public void insere(Vendedor vendedor) {
        if(vendedor.getCodigo()==null || vendedor.getCodigo().isEmpty()) {
            vendedor.setCodigo(codigoUnico());
            vendedorPersistence.insere(vendedor);
        }else{
            Vendedor vendedorExistente = vendedorPersistence.getVendedor(vendedor.getCodigo());
            if(vendedorExistente == null) {
                vendedorPersistence.insere(vendedor);
            } else {
                throw new RuntimeException("Vendedor existente!");
            }
        }
    }

    /**
     *
     * @return uma lista de vendedores ordenada (em ordem crescente) pelo nome
     */
    public List<Vendedor> listagem(){
        List<Vendedor> lista = vendedorPersistence.lista();
        lista.sort((Vendedor v1, Vendedor v2) -> v1.getNome().compareToIgnoreCase(v2.getNome()));
        return lista;
    }

    public Vendedor obtem(String codigo) {
        return vendedorPersistence.getVendedor(codigo);
    }


    public void deleta(String codigo) {
        vendedorPersistence.exclui(codigo);
    }
}
