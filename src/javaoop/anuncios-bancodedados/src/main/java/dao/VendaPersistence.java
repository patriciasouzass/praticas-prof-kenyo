package dao;

import entity.FormaPagamento;
import entity.Venda;
import util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;


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

    public void atualiza(Venda venda) {
        em.getTransaction().begin();
        Venda vendaParaSerAtualizada = em.find(Venda.class, venda.getId());
        vendaParaSerAtualizada.setValorTotal(new BigDecimal(450));
        vendaParaSerAtualizada.setFormaPagamento(FormaPagamento.A_PRAZO);
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
}
