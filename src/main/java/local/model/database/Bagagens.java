package local.model.database;

import java.io.Serializable;
import java.util.Objects;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @Basic(optional = false)
    @Column(name = "item")
    private String item;
    @Basic(optional = false)
    @Column(name = "peso")
    private double peso;

    public Bagagens() {
    }

    public Bagagens(long id) {
        this.id = id;
    }

    public Bagagens(long id, String destino, String item, double peso) {
        this.id = id;
        this.destino = destino;
        this.item = item;
        this.peso = peso;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 59 * hash + Objects.hashCode(this.destino);
        hash = 59 * hash + Objects.hashCode(this.item);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bagagens other = (Bagagens) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        return true;
    }

    
   

    @Override
    public String toString() {
        return "local.model.database.Bagagens[ id=" + id + " ]";
    }

}
