package dao;

import entity.Anuncio;
import util.JPAUtil;
import javax.persistence.EntityManager;


public class AnuncioPersistence {

    private EntityManager em;

    public AnuncioPersistence(){
        em = JPAUtil.getEntityManager();
    }

    public Anuncio getAnuncio(String cod_Anuncio){
        return em.find(Anuncio.class, cod_Anuncio);
    }

    public void insere(Anuncio anuncio){
        try {
            em.getTransaction().begin();
            em.persist(anuncio);
            em.getTransaction().commit();
        } catch (RuntimeException e){
            em.getTransaction().rollback();
        }
    }

    public void atualiza(Anuncio anuncio){
        em.getTransaction().begin();
        Anuncio anuncioParaSerAtualizado = em.find(Anuncio.class, anuncio.getCodigo());
        anuncioParaSerAtualizado.setPreco(anuncio.getPreco());
        anuncioParaSerAtualizado.setTitulo(anuncio.getTitulo());
        em.getTransaction().commit();
    }

    public void deleta(Long id){
        em.getTransaction().begin();
        Anuncio a = em.find(Anuncio.class, id);
        em.remove(a);
        em.getTransaction().commit();
    }
}
