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
@Table(name = "voos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voos.findAll", query = "SELECT v FROM Voos v")
    , @NamedQuery(name = "Voos.findById", query = "SELECT v FROM Voos v WHERE v.id = :id")
    , @NamedQuery(name = "Voos.findByAeroportoDestinoID", query = "SELECT v FROM Voos v WHERE v.aeroportoDestinoID = :aeroportoDestinoID")
    , @NamedQuery(name = "Voos.findByHoraDecolagem", query = "SELECT v FROM Voos v WHERE v.horaDecolagem = :horaDecolagem")
    , @NamedQuery(name = "Voos.findByAviaoID", query = "SELECT v FROM Voos v WHERE v.aviaoID = :aviaoID")
    , @NamedQuery(name = "Voos.findByStatus", query = "SELECT v FROM Voos v WHERE v.status = :status")})
public class Voos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "aeroportoDestinoID")
    private int aeroportoDestinoID;
    @Basic(optional = false)
    @Column(name = "horaDecolagem")
    private String horaDecolagem;
    @Basic(optional = false)
    @Column(name = "aviaoID")
    private int aviaoID;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Voos() {
    }

    public Voos(Integer id) {
        this.id = id;
    }

    public Voos(Integer id, int aeroportoDestinoID, String horaDecolagem, int aviaoID, String status) {
        this.id = id;
        this.aeroportoDestinoID = aeroportoDestinoID;
        this.horaDecolagem = horaDecolagem;
        this.aviaoID = aviaoID;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAeroportoDestinoID() {
        return aeroportoDestinoID;
    }

    public void setAeroportoDestinoID(int aeroportoDestinoID) {
        this.aeroportoDestinoID = aeroportoDestinoID;
    }

    public String getHoraDecolagem() {
        return horaDecolagem;
    }

    public void setHoraDecolagem(String horaDecolagem) {
        this.horaDecolagem = horaDecolagem;
    }

    public int getAviaoID() {
        return aviaoID;
    }

    public void setAviaoID(int aviaoID) {
        this.aviaoID = aviaoID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Voos)) {
            return false;
        }
        Voos other = (Voos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "local.model.database.Voos[ id=" + id + " ]";
    }
    
}
