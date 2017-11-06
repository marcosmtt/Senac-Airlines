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
@Table(name = "destino")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d")
    , @NamedQuery(name = "Destino.findById", query = "SELECT d FROM Destino d WHERE d.id = :id")
    , @NamedQuery(name = "Destino.findByAeroporto", query = "SELECT d FROM Destino d WHERE d.aeroporto = :aeroporto")
    , @NamedQuery(name = "Destino.findByPais", query = "SELECT d FROM Destino d WHERE d.pais = :pais")
    , @NamedQuery(name = "Destino.findByEstado", query = "SELECT d FROM Destino d WHERE d.estado = :estado")
    , @NamedQuery(name = "Destino.findByCidade", query = "SELECT d FROM Destino d WHERE a.cidade = :cidade")})
public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private long id;
    @Basic(optional = false)
    @Column(name = "aeroporto")
    private String aeroporto;
    @Basic(optional = false)
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;

    public Destino() {
    }

    public Destino(long id) {
        this.id = id;
    }

    public Destino(long id, String aeroporto, String pais, String estado, String cidade) {
        this.id = id;
        this.aeroporto = aeroporto;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 29 * hash + Objects.hashCode(this.aeroporto);
        hash = 29 * hash + Objects.hashCode(this.pais);
        hash = 29 * hash + Objects.hashCode(this.estado);
        hash = 29 * hash + Objects.hashCode(this.cidade);
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
        final Destino other = (Destino) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.aeroporto, other.aeroporto)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "local.model.database.Destino[ id=" + id + " ]";
    }

}
