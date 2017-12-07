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
@Table(name = "bagagenslist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bagagenslist.findAll", query = "SELECT b FROM Bagagenslist b")
    , @NamedQuery(name = "Bagagenslist.findById", query = "SELECT b FROM Bagagenslist b WHERE b.id = :id")
    , @NamedQuery(name = "Bagagenslist.findByVooId", query = "SELECT b FROM Bagagenslist b WHERE b.vooId = :vooId")
    , @NamedQuery(name = "Bagagenslist.findByBagagemId", query = "SELECT b FROM Bagagenslist b WHERE b.bagagemId = :bagagemId")})
public class Bagagenslist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "vooId")
    private int vooId;
    @Basic(optional = false)
    @Column(name = "bagagemId")
    private int bagagemId;

    public Bagagenslist() {
    }

    public Bagagenslist(Integer id) {
        this.id = id;
    }

    public Bagagenslist(Integer id, int vooId, int bagagemId) {
        this.id = id;
        this.vooId = vooId;
        this.bagagemId = bagagemId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getVooId() {
        return vooId;
    }

    public void setVooId(int vooId) {
        this.vooId = vooId;
    }

    public int getBagagemId() {
        return bagagemId;
    }

    public void setBagagemId(int bagagemId) {
        this.bagagemId = bagagemId;
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
        if (!(object instanceof Bagagenslist)) {
            return false;
        }
        Bagagenslist other = (Bagagenslist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "local.model.database.Bagagenslist[ id=" + id + " ]";
    }
    
}
