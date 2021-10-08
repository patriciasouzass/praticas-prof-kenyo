package service;

import dao.VendaPersistence;
import entity.Venda;

public class VendaService {

    VendaPersistence vendaPersistence;

    public VendaService(VendaPersistence vendaPersistence){
        this.vendaPersistence = vendaPersistence;
    }

    public VendaService(){}

    public void insere(Venda venda){
        Venda vendaExiste = vendaPersistence.getVenda(venda.getAnuncio().getCodigo(), venda.getVendedor().getCodigo());
        if (vendaExiste == null){
            vendaPersistence.insere(venda);
        } else {
            throw new RuntimeException("Venda existente!");
        }
    }
}
