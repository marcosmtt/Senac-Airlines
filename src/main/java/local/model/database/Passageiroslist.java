/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package local.model.database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yuri
 */
@Entity
@Table(name = "passageiroslist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Passageiroslist.findAll", query = "SELECT p FROM Passageiroslist p")
    , @NamedQuery(name = "Passageiroslist.findById", query = "SELECT p FROM Passageiroslist p WHERE p.id = :id")
    , @NamedQuery(name = "Passageiroslist.findByClienteId", query = "SELECT p FROM Passageiroslist p WHERE p.clienteId = :clienteId")
    , @NamedQuery(name = "Passageiroslist.findByVooId", query = "SELECT p FROM Passageiroslist p WHERE p.vooId = :vooId")})
public class Passageiroslist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "clienteId")
    private int clienteId;
    @Basic(optional = false)
    @Column(name = "vooId")
    private int vooId;

    public Passageiroslist() {
    }

    public Passageiroslist(Integer id) {
        this.id = id;
    }

    public Passageiroslist(Integer id, int clienteId, int vooId) {
        this.id = id;
        this.clienteId = clienteId;
        this.vooId = vooId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getVooId() {
        return vooId;
    }

    public void setVooId(int vooId) {
        this.vooId = vooId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passageiroslist)) {
            return false;
        }
        Passageiroslist other = (Passageiroslist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "local.model.database.Passageiroslist[ id=" + id + " ]";
    }
    
}
