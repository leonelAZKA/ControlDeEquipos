/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rogelio
 */
@Entity
@Table(name = "CEPERMISOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CePermisos.findAll", query = "SELECT c FROM CePermisos c"),
    @NamedQuery(name = "CePermisos.findByPerid", query = "SELECT c FROM CePermisos c WHERE c.perid = :perid"),
    @NamedQuery(name = "CePermisos.findByPercodigosubmenu", query = "SELECT c FROM CePermisos c WHERE c.percodigosubmenu = :percodigosubmenu"),
    @NamedQuery(name = "CePermisos.findByPerdepartamento", query = "SELECT c FROM CePermisos c WHERE c.perdepartamento = :perdepartamento"),
    @NamedQuery(name = "CePermisos.findByPerestado", query = "SELECT c FROM CePermisos c WHERE c.perestado = :perestado"),
    @NamedQuery(name = "CePermisos.findByPernombre", query = "SELECT c FROM CePermisos c WHERE c.pernombre = :pernombre"),
    @NamedQuery(name = "CePermisos.findByPertipo", query = "SELECT c FROM CePermisos c WHERE c.pertipo = :pertipo"),
    @NamedQuery(name = "CePermisos.findByPerurl", query = "SELECT c FROM CePermisos c WHERE c.perurl = :perurl")})
public class CePermisos implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PERID")
    private BigDecimal perid;
    @Column(name = "PERCODIGOSUBMENU")
    private BigInteger percodigosubmenu;
    @Size(max = 255)
    @Column(name = "PERDEPARTAMENTO")
    private String perdepartamento;
    @Size(max = 255)
    @Column(name = "PERESTADO")
    private String perestado;
    @Size(max = 255)
    @Column(name = "PERNOMBRE")
    private String pernombre;
    @Size(max = 255)
    @Column(name = "PERTIPO")
    private String pertipo;
    @Size(max = 255)
    @Column(name = "PERURL")
    private String perurl;

    public CePermisos() {
    }

    public CePermisos(BigDecimal perid) {
        this.perid = perid;
    }

    public BigDecimal getPerid() {
        return perid;
    }

    public void setPerid(BigDecimal perid) {
        this.perid = perid;
    }

    public BigInteger getPercodigosubmenu() {
        return percodigosubmenu;
    }

    public void setPercodigosubmenu(BigInteger percodigosubmenu) {
        this.percodigosubmenu = percodigosubmenu;
    }

    public String getPerdepartamento() {
        return perdepartamento;
    }

    public void setPerdepartamento(String perdepartamento) {
        this.perdepartamento = perdepartamento;
    }

    public String getPerestado() {
        return perestado;
    }

    public void setPerestado(String perestado) {
        this.perestado = perestado;
    }

    public String getPernombre() {
        return pernombre;
    }

    public void setPernombre(String pernombre) {
        this.pernombre = pernombre;
    }

    public String getPertipo() {
        return pertipo;
    }

    public void setPertipo(String pertipo) {
        this.pertipo = pertipo;
    }

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perid != null ? perid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CePermisos)) {
            return false;
        }
        CePermisos other = (CePermisos) object;
        if ((this.perid == null && other.perid != null) || (this.perid != null && !this.perid.equals(other.perid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.azka.controlDeEquipos.entity.CePermisos[ perid=" + perid + " ]";
    }
    
}
