package mx.azka.controlDeEquipos.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

    private Long idusuario;
    private String usuusername;
    private String usudepartamento;
    private Long ceempleadoEmpidempleado;
    private String usupassword;

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

    public LoginBean() {
    }
}
