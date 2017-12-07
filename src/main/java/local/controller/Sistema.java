package local.controller;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import local.controller.database.AvioesDAO;
import local.controller.database.BagagensDAO;
import local.controller.database.BagagensListDAO;
import local.controller.database.ClientesDAO;
import local.controller.database.DestinoDAO;
import local.controller.database.PassageiroslistDAO;
import local.controller.database.VoosDAO;
import local.model.database.Avioes;
import local.model.database.Bagagens;
import local.model.database.Bagagenslist;
import local.model.database.Clientes;
import local.model.database.Destino;
import local.model.database.Voos;
import local.view.TelaInicial;

public class Sistema implements Gerenciador {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myUnit");
    private final TelaInicial telaInicial;

    private final AvioesDAO jpaAvioes = new AvioesDAO(emf);
    private final ClientesDAO jpaClientes = new ClientesDAO(emf);
    private final DestinoDAO jpaDestino = new DestinoDAO(emf);
    private final BagagensDAO jpaBagagens = new BagagensDAO(emf);
    private final VoosDAO jpaVoos = new VoosDAO(emf);
    private final PassageiroslistDAO jpaPassageiroList = new PassageiroslistDAO(emf);
    private final BagagensListDAO jpaBagagensList = new BagagensListDAO(emf);

    public Sistema(TelaInicial telaInicial) {
        this.telaInicial = telaInicial;
    }

    @Override
    public void cadastrar(Object obj) {

        if (obj instanceof Clientes) {
            //INSERT cliente no banco de dados
            jpaClientes.create((Clientes) obj);
        }
        if (obj instanceof Avioes) {
            //INSERT aviao no banco de dados
            jpaAvioes.create((Avioes) obj);
        }
        if (obj instanceof Destino) {
            //INSERT destino no banco de dados
            jpaDestino.create((Destino) obj);
        }
        if (obj instanceof Bagagens) {
            //INSERT bagagens no banco de dados
            jpaBagagens.create((Bagagens) obj);
        }
        if (obj instanceof Voos) {
            //INSERT voos no banco de dados
            jpaVoos.create((Voos) obj);
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
        if (instance instanceof Destino) {
            return jpaDestino.findDestinoEntities();
        }
        if (instance instanceof Voos) {
            return jpaVoos.findVoosEntities();
        }
        if (instance instanceof Bagagens) {
            return jpaBagagens.findBagagensEntities();
        }
        if (instance instanceof Bagagenslist) {
            return jpaBagagensList.findBagagenslistEntities();
        }

        return null;
    }

    public AvioesDAO getJpaAvioes() {
        return jpaAvioes;
    }

    public ClientesDAO getJpaClientes() {
        return jpaClientes;
    }

    public DestinoDAO getJpaDestino() {
        return jpaDestino;
    }

    public VoosDAO getJpaVoos() {
        return jpaVoos;
    }

    public PassageiroslistDAO getJpaPassageiroList() {
        return jpaPassageiroList;
    }

    public BagagensListDAO getJpaBagagensList() {
        return jpaBagagensList;
    }

    public BagagensDAO getJpaBagagensDAO() {
        return jpaBagagens;
    }

    public TelaInicial getTelaInicial() {
        return telaInicial;
    }

}
