package local.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import local.controller.database.AvioesDAO;
import local.controller.database.ClientesDAO;
import local.model.database.Avioes;
import local.model.database.Clientes;

public class Sistema implements Gerenciador {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");

    AvioesDAO jpaAvioes = new AvioesDAO(emf);
    ClientesDAO jpaClientes = new ClientesDAO(emf);

    @Override
    public void cadastrar(Object obj) {
        
        //verifica se o tipo do objeto recebido é um cliente
        if (obj instanceof Clientes) {
            //INSERT cliente no banco de dados
            jpaClientes.create((Clientes) obj);
            
            JOptionPane.showMessageDialog(null, "done!");
        }
        
        //verifica se o tipo do objeto recebido é um aviao
        if (obj instanceof Avioes) {
            //INSERT aviao no banco de dados
            jpaAvioes.create((Avioes) obj);
            
            JOptionPane.showMessageDialog(null, "done!");
        }
    }

    @Override
    public void alterar(Object obj) {
    }

    @Override
    public void remover(Object obj) {
    }

}
