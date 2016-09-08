
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
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
 * @author sat

 */
@Entity
@Table(name = "CEUSUARIO")
@XmlRootElement


    
public class CeUsuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUSUARIOS")
    private Long idusuario;
    @Size(max = 255)
    @Column(name = "USUUSERNAME")
    private String usuusername;
    @Size(max = 255)
    @Column(name = "USUDEPARTAMENTO")
    private String usudepartamento;
    @Column(name = "CEEMPLEADO_EMPIDEMPLEADO")
    private Long ceempleadoEmpidempleado;
    @Size(max = 255)
    @Column(name = "USUPASSWORD")
    private String usupassword;

    public CeUsuario() {
    }

    public CeUsuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuusername() {
        return usuusername;
    }

    public void setUsuusername(String usuusername) {
        this.usuusername = usuusername;

    }

    public String getUsudepartamento() {
        return usudepartamento;
    }

    public void setUsudepartamento(String usudepartamento) {
        this.usudepartamento = usudepartamento;
    }


    public Long getCeempleadoEmpidempleado() {
        return ceempleadoEmpidempleado;
    }

    public void setCeempleadoEmpidempleado(Long ceempleadoEmpidempleado) {
        this.ceempleadoEmpidempleado = ceempleadoEmpidempleado;
    }

    public String getUsupassword() {
        return usupassword;
    }

    public void setUsupassword(String usupassword) {
        this.usupassword = usupassword;

    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += (idusuario != null ? idusuario.hashCode() : 0);

        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set

        if (!(object instanceof CeUsuario)) {
            return false;
        }
        CeUsuario other = (CeUsuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {

            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        return "mx.azka.controlDeEquipos.entity.CeUsuario[ idusuario=" + idusuario + " ]";

    }
    
}
