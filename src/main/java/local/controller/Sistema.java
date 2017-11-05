package local.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import local.controller.database.AvioesDAO;
import local.model.database.Avioes;

public class Sistema implements Gerenciador {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");

    AvioesDAO jpaAvioes = new AvioesDAO(emf);

    @Override
    public void cadastrar(Object obj) {
        if (obj instanceof Avioes) {
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
