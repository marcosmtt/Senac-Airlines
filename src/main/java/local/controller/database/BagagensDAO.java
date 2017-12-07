/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.controller.database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import local.controller.database.exceptions.NonexistentEntityException;
import local.model.database.Bagagens;

/**
 *
 * @author Yuri
 */
public class BagagensDAO implements Serializable {

    public BagagensDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Bagagens bagagens) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bagagens);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Bagagens bagagens) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bagagens = em.merge(bagagens);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = bagagens.getId();
                if (findBagagens(id) == null) {
                    throw new NonexistentEntityException("The bagagens with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Bagagens bagagens;
            try {
                bagagens = em.getReference(Bagagens.class, id);
                bagagens.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bagagens with id " + id + " no longer exists.", enfe);
            }
            em.remove(bagagens);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Bagagens> findBagagensEntities() {
        return findBagagensEntities(true, -1, -1);
    }

    public List<Bagagens> findBagagensEntities(int maxResults, int firstResult) {
        return findBagagensEntities(false, maxResults, firstResult);
    }

    private List<Bagagens> findBagagensEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Bagagens.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Bagagens findBagagens(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Bagagens.class, id);
        } finally {
            em.close();
        }
    }

    public int getBagagensCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Bagagens> rt = cq.from(Bagagens.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
