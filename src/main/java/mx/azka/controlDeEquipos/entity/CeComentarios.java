/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rogelio
 */
@Entity
@Table(name = "CECOMENTARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CeComentarios.findAll", query = "SELECT c FROM CeComentarios c"),
    @NamedQuery(name = "CeComentarios.findByComid", query = "SELECT c FROM CeComentarios c WHERE c.comid = :comid"),
    @NamedQuery(name = "CeComentarios.findByComcomentario", query = "SELECT c FROM CeComentarios c WHERE c.comcomentario = :comcomentario"),
    @NamedQuery(name = "CeComentarios.findByComfecha", query = "SELECT c FROM CeComentarios c WHERE c.comfecha = :comfecha")})
public class CeComentarios implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMID")
    private BigDecimal comid;
    @Size(max = 255)
    @Column(name = "COMCOMENTARIO")
    private String comcomentario;
    @Column(name = "COMFECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date comfecha;
    @JoinColumn(name = "IDUSUARIOS", referencedColumnName = "IDUSUARIOS")
    @ManyToOne(fetch = FetchType.LAZY)
    private CeUsuario idusuarios;
    @JoinColumn(name = "EQUID", referencedColumnName = "EQUID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CeEquipos equid;
    @JoinColumn(name = "EMPIDEMPLEADO", referencedColumnName = "EMPIDEMPLEADO")
    @ManyToOne(fetch = FetchType.LAZY)
    private CeEmpleado empidempleado;

    public CeComentarios() {
    }

    public CeComentarios(BigDecimal comid) {
        this.comid = comid;
    }

    public BigDecimal getComid() {
        return comid;
    }

    public void setComid(BigDecimal comid) {
        this.comid = comid;
    }

    public String getComcomentario() {
        return comcomentario;
    }

    public void setComcomentario(String comcomentario) {
        this.comcomentario = comcomentario;
    }

    public Date getComfecha() {
        return comfecha;
    }

    public void setComfecha(Date comfecha) {
        this.comfecha = comfecha;
    }

    public CeUsuario getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(CeUsuario idusuarios) {
        this.idusuarios = idusuarios;
    }

    public CeEquipos getEquid() {
        return equid;
    }

    public void setEquid(CeEquipos equid) {
        this.equid = equid;
    }

    public CeEmpleado getEmpidempleado() {
        return empidempleado;
    }

    public void setEmpidempleado(CeEmpleado empidempleado) {
        this.empidempleado = empidempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comid != null ? comid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeComentarios)) {
            return false;
        }
        CeComentarios other = (CeComentarios) object;
        if ((this.comid == null && other.comid != null) || (this.comid != null && !this.comid.equals(other.comid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.azka.controlDeEquipos.entity.CeComentarios[ comid=" + comid + " ]";
    }
    
}
