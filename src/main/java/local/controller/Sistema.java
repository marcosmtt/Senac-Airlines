package local.controller;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import local.controller.database.AvioesDAO;
import local.controller.database.ClientesDAO;
import local.model.database.Avioes;
import local.model.database.Clientes;

public class Sistema implements Gerenciador {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");

    private AvioesDAO jpaAvioes = new AvioesDAO(emf);
    private ClientesDAO jpaClientes = new ClientesDAO(emf);

    private List<Clientes> clienteList;

    @Override
    public void cadastrar(Object obj) {

        //verifica se o tipo do objeto recebido é um cliente
        if (obj instanceof Clientes) {
            //INSERT cliente no banco de dados
            jpaClientes.create((Clientes) obj);

        }

        //verifica se o tipo do objeto recebido é um aviao
        if (obj instanceof Avioes) {
            //INSERT aviao no banco de dados
            jpaAvioes.create((Avioes) obj);

        }
    }

    @Override
    public void alterar(Object obj) {
    }

    @Override
    public void remover(Object obj) {

    }

    @Override
    public List select(Object instance) {
        if (instance instanceof Clientes) {
            return jpaClientes.findClientesEntities();
        }

        if (instance instanceof Avioes) {
            return jpaAvioes.findAvioesEntities();
        }

        return null;
    }

    public AvioesDAO getJpaAvioes() {
        return jpaAvioes;
    }

    public ClientesDAO getJpaClientes() {
        return jpaClientes;
    }
    
    

}
