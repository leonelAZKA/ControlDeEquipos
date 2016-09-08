/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rogelio
 */
@Entity
@Table(name = "CEPROYECTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CeProyecto.findAll", query = "SELECT c FROM CeProyecto c"),
    @NamedQuery(name = "CeProyecto.findByProidproyecto", query = "SELECT c FROM CeProyecto c WHERE c.proidproyecto = :proidproyecto"),
    @NamedQuery(name = "CeProyecto.findByProdescripcion", query = "SELECT c FROM CeProyecto c WHERE c.prodescripcion = :prodescripcion")})
public class CeProyecto implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PROIDPROYECTO")
    private BigDecimal proidproyecto;
    @Size(max = 255)
    @Column(name = "PRODESCRIPCION")
    private String prodescripcion;
    @OneToMany(mappedBy = "empidproyecto", fetch = FetchType.LAZY)
    private Collection<CeEmpleado> ceEmpleadoCollection;

    public CeProyecto() {
    }

    public CeProyecto(BigDecimal proidproyecto) {
        this.proidproyecto = proidproyecto;
    }

    public BigDecimal getProidproyecto() {
        return proidproyecto;
    }

    public void setProidproyecto(BigDecimal proidproyecto) {
        this.proidproyecto = proidproyecto;
    }

    public String getProdescripcion() {
        return prodescripcion;
    }

    public void setProdescripcion(String prodescripcion) {
        this.prodescripcion = prodescripcion;
    }

    @XmlTransient
    public Collection<CeEmpleado> getCeEmpleadoCollection() {
        return ceEmpleadoCollection;
    }

    public void setCeEmpleadoCollection(Collection<CeEmpleado> ceEmpleadoCollection) {
        this.ceEmpleadoCollection = ceEmpleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proidproyecto != null ? proidproyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeProyecto)) {
            return false;
        }
        CeProyecto other = (CeProyecto) object;
        if ((this.proidproyecto == null && other.proidproyecto != null) || (this.proidproyecto != null && !this.proidproyecto.equals(other.proidproyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.azka.controlDeEquipos.entity.CeProyecto[ proidproyecto=" + proidproyecto + " ]";
    }
    
}
