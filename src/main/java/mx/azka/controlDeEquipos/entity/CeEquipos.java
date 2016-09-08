/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rogelio
 */
@Entity
@Table(name = "CEEQUIPOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CeEquipos.findAll", query = "SELECT c FROM CeEquipos c"),
    @NamedQuery(name = "CeEquipos.findByEquid", query = "SELECT c FROM CeEquipos c WHERE c.equid = :equid"),
    @NamedQuery(name = "CeEquipos.findByEquadicional", query = "SELECT c FROM CeEquipos c WHERE c.equadicional = :equadicional"),
    @NamedQuery(name = "CeEquipos.findByEqudiscoDuro", query = "SELECT c FROM CeEquipos c WHERE c.equdiscoDuro = :equdiscoDuro"),
    @NamedQuery(name = "CeEquipos.findByEqufechaCompra", query = "SELECT c FROM CeEquipos c WHERE c.equfechaCompra = :equfechaCompra"),
    @NamedQuery(name = "CeEquipos.findByEqufechaFin", query = "SELECT c FROM CeEquipos c WHERE c.equfechaFin = :equfechaFin"),
    @NamedQuery(name = "CeEquipos.findByEqufechaInicio", query = "SELECT c FROM CeEquipos c WHERE c.equfechaInicio = :equfechaInicio"),
    @NamedQuery(name = "CeEquipos.findByEqumarcac", query = "SELECT c FROM CeEquipos c WHERE c.equmarcac = :equmarcac"),
    @NamedQuery(name = "CeEquipos.findByEqumarcae", query = "SELECT c FROM CeEquipos c WHERE c.equmarcae = :equmarcae"),
    @NamedQuery(name = "CeEquipos.findByEqumemoria", query = "SELECT c FROM CeEquipos c WHERE c.equmemoria = :equmemoria"),
    @NamedQuery(name = "CeEquipos.findByEqumodelo", query = "SELECT c FROM CeEquipos c WHERE c.equmodelo = :equmodelo"),
    @NamedQuery(name = "CeEquipos.findByEqunsc", query = "SELECT c FROM CeEquipos c WHERE c.equnsc = :equnsc"),
    @NamedQuery(name = "CeEquipos.findByEqunse", query = "SELECT c FROM CeEquipos c WHERE c.equnse = :equnse")})
public class CeEquipos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EQUID")
    private BigDecimal equid;
    @Size(max = 255)
    @Column(name = "EQUADICIONAL")
    private String equadicional;
    @Size(max = 255)
    @Column(name = "EQUDISCO_DURO")
    private String equdiscoDuro;
    @Column(name = "EQUFECHA_COMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equfechaCompra;
    @Column(name = "EQUFECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equfechaFin;
    @Column(name = "EQUFECHA_INICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equfechaInicio;
    @Size(max = 255)
    @Column(name = "EQUMARCAC")
    private String equmarcac;
    @Size(max = 255)
    @Column(name = "EQUMARCAE")
    private String equmarcae;
    @Size(max = 255)
    @Column(name = "EQUMEMORIA")
    private String equmemoria;
    @Size(max = 255)
    @Column(name = "EQUMODELO")
    private String equmodelo;
    @Size(max = 255)
    @Column(name = "EQUNSC")
    private String equnsc;
    @Size(max = 255)
    @Column(name = "EQUNSE")
    private String equnse;
    @OneToMany(mappedBy = "equid", fetch = FetchType.LAZY)
    private Collection<CeComentarios> ceComentariosCollection;
    @JoinColumn(name = "CEEMPLEADO_EMPIDEMPLEADO", referencedColumnName = "EMPIDEMPLEADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CeEmpleado ceempleadoEmpidempleado;

    public CeEquipos() {
    }

    public CeEquipos(BigDecimal equid) {
        this.equid = equid;
    }

    public BigDecimal getEquid() {
        return equid;
    }

    public void setEquid(BigDecimal equid) {
        this.equid = equid;
    }

    public String getEquadicional() {
        return equadicional;
    }

    public void setEquadicional(String equadicional) {
        this.equadicional = equadicional;
    }

    public String getEqudiscoDuro() {
        return equdiscoDuro;
    }

    public void setEqudiscoDuro(String equdiscoDuro) {
        this.equdiscoDuro = equdiscoDuro;
    }

    public Date getEqufechaCompra() {
        return equfechaCompra;
    }

    public void setEqufechaCompra(Date equfechaCompra) {
        this.equfechaCompra = equfechaCompra;
    }

    public Date getEqufechaFin() {
        return equfechaFin;
    }

    public void setEqufechaFin(Date equfechaFin) {
        this.equfechaFin = equfechaFin;
    }

    public Date getEqufechaInicio() {
        return equfechaInicio;
    }

    public void setEqufechaInicio(Date equfechaInicio) {
        this.equfechaInicio = equfechaInicio;
    }

    public String getEqumarcac() {
        return equmarcac;
    }

    public void setEqumarcac(String equmarcac) {
        this.equmarcac = equmarcac;
    }

    public String getEqumarcae() {
        return equmarcae;
    }

    public void setEqumarcae(String equmarcae) {
        this.equmarcae = equmarcae;
    }

    public String getEqumemoria() {
        return equmemoria;
    }

    public void setEqumemoria(String equmemoria) {
        this.equmemoria = equmemoria;
    }

    public String getEqumodelo() {
        return equmodelo;
    }

    public void setEqumodelo(String equmodelo) {
        this.equmodelo = equmodelo;
    }

    public String getEqunsc() {
        return equnsc;
    }

    public void setEqunsc(String equnsc) {
        this.equnsc = equnsc;
    }

    public String getEqunse() {
        return equnse;
    }

    public void setEqunse(String equnse) {
        this.equnse = equnse;
    }

    @XmlTransient
    public Collection<CeComentarios> getCeComentariosCollection() {
        return ceComentariosCollection;
    }

    public void setCeComentariosCollection(Collection<CeComentarios> ceComentariosCollection) {
        this.ceComentariosCollection = ceComentariosCollection;
    }

    public CeEmpleado getCeempleadoEmpidempleado() {
        return ceempleadoEmpidempleado;
    }

    public void setCeempleadoEmpidempleado(CeEmpleado ceempleadoEmpidempleado) {
        this.ceempleadoEmpidempleado = ceempleadoEmpidempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (equid != null ? equid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeEquipos)) {
            return false;
        }
        CeEquipos other = (CeEquipos) object;
        if ((this.equid == null && other.equid != null) || (this.equid != null && !this.equid.equals(other.equid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.azka.controlDeEquipos.entity.CeEquipos[ equid=" + equid + " ]";
    }
    
}
