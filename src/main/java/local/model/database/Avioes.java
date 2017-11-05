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
@Table(name = "avioes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avioes.findAll", query = "SELECT a FROM Avioes a")
    , @NamedQuery(name = "Avioes.findById", query = "SELECT a FROM Avioes a WHERE a.id = :id")
    , @NamedQuery(name = "Avioes.findByEmpresa", query = "SELECT a FROM Avioes a WHERE a.empresa = :empresa")
    , @NamedQuery(name = "Avioes.findByModelo", query = "SELECT a FROM Avioes a WHERE a.modelo = :modelo")
    , @NamedQuery(name = "Avioes.findByVelocidade", query = "SELECT a FROM Avioes a WHERE a.velocidade = :velocidade")
    , @NamedQuery(name = "Avioes.findByCapacidade", query = "SELECT a FROM Avioes a WHERE a.capacidade = :capacidade")})
public class Avioes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @Column(name = "velocidade")
    private int velocidade;
    @Basic(optional = false)
    @Column(name = "capacidade")
    private int capacidade;

    public Avioes() {
    }

    public Avioes(Integer id) {
        this.id = id;
    }

    public Avioes(Integer id, String empresa, String modelo, int velocidade, int capacidade) {
        this.id = id;
        this.empresa = empresa;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
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
        final Avioes other = (Avioes) obj;
        if (this.velocidade != other.velocidade) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "local.controller.database.Avioes[ id=" + id + " ]";
    }

}
