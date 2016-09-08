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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "CEEMPLEADO")
@XmlRootElement

public class CeEmpleado implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPIDEMPLEADO")
    private BigDecimal empidempleado;
    @Size(max = 255)
    @Column(name = "EMPAPP_MATERNO")
    private String empappMaterno;
    @Size(max = 255)
    @Column(name = "EMPAPP_PATERNO")
    private String empappPaterno;
    @Size(max = 255)
    @Column(name = "EMPNOMBRE")
    private String empnombre;
    @OneToMany(mappedBy = "empidempleado", fetch = FetchType.LAZY)
    private Collection<CeComentarios> ceComentariosCollection;
    @JoinColumn(name = "EMPIDPROYECTO", referencedColumnName = "PROIDPROYECTO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CeProyecto empidproyecto;
    @OneToMany(mappedBy = "ceempleadoEmpidempleado", fetch = FetchType.LAZY)

    private Collection<CeEquipos> ceEquiposCollection;

    public CeEmpleado() {
    }

    public CeEmpleado(BigDecimal empidempleado) {
        this.empidempleado = empidempleado;
    }

    public BigDecimal getEmpidempleado() {
        return empidempleado;
    }

    public void setEmpidempleado(BigDecimal empidempleado) {
        this.empidempleado = empidempleado;
    }

    public String getEmpappMaterno() {
        return empappMaterno;
    }

    public void setEmpappMaterno(String empappMaterno) {
        this.empappMaterno = empappMaterno;
    }

    public String getEmpappPaterno() {
        return empappPaterno;
    }

    public void setEmpappPaterno(String empappPaterno) {
        this.empappPaterno = empappPaterno;
    }

    public String getEmpnombre() {
        return empnombre;
    }

    public void setEmpnombre(String empnombre) {
        this.empnombre = empnombre;
    }

    @XmlTransient
    public Collection<CeComentarios> getCeComentariosCollection() {
        return ceComentariosCollection;
    }

    public void setCeComentariosCollection(Collection<CeComentarios> ceComentariosCollection) {
        this.ceComentariosCollection = ceComentariosCollection;
    }

    public CeProyecto getEmpidproyecto() {
        return empidproyecto;
    }

    public void setEmpidproyecto(CeProyecto empidproyecto) {
        this.empidproyecto = empidproyecto;
    }


    @XmlTransient
    public Collection<CeEquipos> getCeEquiposCollection() {
        return ceEquiposCollection;
    }

    public void setCeEquiposCollection(Collection<CeEquipos> ceEquiposCollection) {
        this.ceEquiposCollection = ceEquiposCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empidempleado != null ? empidempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeEmpleado)) {
            return false;
        }
        CeEmpleado other = (CeEmpleado) object;
        if ((this.empidempleado == null && other.empidempleado != null) || (this.empidempleado != null && !this.empidempleado.equals(other.empidempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.azka.controlDeEquipos.entity.CeEmpleado[ empidempleado=" + empidempleado + " ]";
    }
    
}
