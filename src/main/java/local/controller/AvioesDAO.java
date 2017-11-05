
package local.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import local.model.database.Avioes;
import local.controller.exceptions.NonexistentEntityException;

public class AvioesDAO implements Serializable {

    public AvioesDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Avioes avioes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(avioes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Avioes avioes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            avioes = em.merge(avioes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = avioes.getId();
                if (findAvioes(id) == null) {
                    throw new NonexistentEntityException("The avioes with id " + id + " no longer exists.");
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
            Avioes avioes;
            try {
                avioes = em.getReference(Avioes.class, id);
                avioes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The avioes with id " + id + " no longer exists.", enfe);
            }
            em.remove(avioes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Avioes> findAvioesEntities() {
        return findAvioesEntities(true, -1, -1);
    }

    public List<Avioes> findAvioesEntities(int maxResults, int firstResult) {
        return findAvioesEntities(false, maxResults, firstResult);
    }

    private List<Avioes> findAvioesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Avioes.class));
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

    public Avioes findAvioes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Avioes.class, id);
        } finally {
            em.close();
        }
    }

    public int getAvioesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Avioes> rt = cq.from(Avioes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
