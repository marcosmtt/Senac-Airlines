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
import local.model.database.Bagagenslist;

/**
 *
 * @author Yuri
 */
public class BagagensListDAO implements Serializable {

    public BagagensListDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Bagagenslist bagagenslist) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(bagagenslist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Bagagenslist bagagenslist) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            bagagenslist = em.merge(bagagenslist);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = bagagenslist.getId();
                if (findBagagenslist(id) == null) {
                    throw new NonexistentEntityException("The bagagenslist with id " + id + " no longer exists.");
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
            Bagagenslist bagagenslist;
            try {
                bagagenslist = em.getReference(Bagagenslist.class, id);
                bagagenslist.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bagagenslist with id " + id + " no longer exists.", enfe);
            }
            em.remove(bagagenslist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Bagagenslist> findBagagenslistEntities() {
        return findBagagenslistEntities(true, -1, -1);
    }

    public List<Bagagenslist> findBagagenslistEntities(int maxResults, int firstResult) {
        return findBagagenslistEntities(false, maxResults, firstResult);
    }

    private List<Bagagenslist> findBagagenslistEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Bagagenslist.class));
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

    public Bagagenslist findBagagenslist(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Bagagenslist.class, id);
        } finally {
            em.close();
        }
    }

    public int getBagagenslistCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Bagagenslist> rt = cq.from(Bagagenslist.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
