package local.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.eclipse.persistence.jaxb.TypeMappingInfo.ElementScope.Local;

public class ClientesDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ClientePU");
        return factory.createEntityManager();
    }
    
    public Local save(Local local){
        EntityManager em =  getEM();
        
        try{
        em.getTransaction().begin();
        em.persist(local); //executa o insert
        em.getTransaction().commit();
        }catch(Exception ex){
            em.getTransaction().rollback();
        }finally{
        em.close();
    }
        return local;
    }
}
