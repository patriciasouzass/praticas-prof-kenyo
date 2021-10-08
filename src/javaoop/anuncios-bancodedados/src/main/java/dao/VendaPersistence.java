package dao;

import entity.Anuncio;
import entity.FormaPagamento;
import entity.Venda;
import entity.Vendedor;
import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class VendaPersistence {

    private EntityManager em;

    public VendaPersistence() {
        em = JPAUtil.getEntityManager();
    }

    public void insere(Venda venda){
        try {
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            em.getTransaction().rollback();
        }
    }

    public Venda get(Long id){
        return em.find(Venda.class, id);
    }

    public List<Venda> lista(){
        TypedQuery<Venda> qry = em.createQuery("from Venda", Venda.class); //from Venda >> Classe
        return qry.getResultList();
    }

    public void atualiza(Venda venda) {
        em.getTransaction().begin();
        Venda vendaParaSerAtualizada = em.find(Venda.class, venda.getId());
        vendaParaSerAtualizada.setFormaPagamento(venda.getFormaPagamento());
        em.getTransaction().commit();
    }

    public void deleta(Long id){
        em.getTransaction().begin();
        Venda v = em.find(Venda.class, id);
        em.remove(v);
        em.getTransaction().commit();
    }

    public Venda getVenda(String cod_Vendedor, String cod_Anuncio){
        TypedQuery<Venda> qry = em.createQuery("select * from Venda v where v.vendedor.codigo =: new_vendedor and v.anuncio = new_anuncio", Venda.class);
        qry.setParameter(1, cod_Vendedor);
        qry.setParameter(2, cod_Anuncio);
        Venda venda = qry.getSingleResult();
        return venda;

    }


    public static void main(String[] args) {
        VendaPersistence vendaPersistence = new VendaPersistence();
        VendedorPersistence vendedorPersistence = new VendedorPersistence();

        Vendedor vendedor = vendedorPersistence.get("MLB126");

        AnuncioPersistence anuncioPersistence = new AnuncioPersistence();
        Anuncio anuncio = anuncioPersistence.get("ML111");

        vendaPersistence.insere(new Venda(LocalDate.now(), new BigDecimal(1000), FormaPagamento.A_PRAZO, vendedor, anuncio));
    }
}
