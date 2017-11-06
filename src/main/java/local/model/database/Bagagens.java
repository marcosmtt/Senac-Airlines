package local.model.database;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "bagagens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bagagens.findAll", query = "SELECT b FROM Bagagens b"),
      @NamedQuery(name = "Bagagens.findById", query = "SELECT b FROM Bagagens b WHERE b.id = :id"), 
      @NamedQuery(name = "Bagagens.findByDestino", query = "SELECT b FROM Bagagens b WHERE b.destino = :destino"), 
      @NamedQuery(name = "Bagagens.findByItem", query = "SELECT b FROM Bagagens b WHERE b.item = :item"), 
      @NamedQuery(name = "Bagagens.findByPeso", query = "SELECT b FROM Bagagens b WHERE b.peso = :peso"),
    })
public class Bagagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Bagagens)) {
            return false;
        }
        Bagagens other = (Bagagens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "local.model.database.Bagagens[ id=" + id + " ]";
    }

}
