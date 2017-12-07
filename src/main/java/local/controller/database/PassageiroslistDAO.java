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
import local.model.database.Passageiroslist;

/**
 *
 * @author Yuri
 */
public class PassageiroslistDAO implements Serializable {

    public PassageiroslistDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Passageiroslist passageiroslist) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(passageiroslist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Passageiroslist passageiroslist) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            passageiroslist = em.merge(passageiroslist);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = passageiroslist.getId();
                if (findPassageiroslist(id) == null) {
                    throw new NonexistentEntityException("The passageiroslist with id " + id + " no longer exists.");
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
            Passageiroslist passageiroslist;
            try {
                passageiroslist = em.getReference(Passageiroslist.class, id);
                passageiroslist.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The passageiroslist with id " + id + " no longer exists.", enfe);
            }
            em.remove(passageiroslist);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Passageiroslist> findPassageiroslistEntities() {
        return findPassageiroslistEntities(true, -1, -1);
    }

    public List<Passageiroslist> findPassageiroslistEntities(int maxResults, int firstResult) {
        return findPassageiroslistEntities(false, maxResults, firstResult);
    }

    private List<Passageiroslist> findPassageiroslistEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Passageiroslist.class));
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

    public Passageiroslist findPassageiroslist(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Passageiroslist.class, id);
        } finally {
            em.close();
        }
    }

    public int getPassageiroslistCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Passageiroslist> rt = cq.from(Passageiroslist.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
