package mx.azka.controlDeEquipos.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.azka.controlDeEquipos.ejb.CeUsuarioFacadeLocal;
import org.primefaces.context.RequestContext;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "loginController")
@SessionScoped
public class LoginController implements Serializable {

    @EJB
    CeUsuarioFacadeLocal ceUsuarioFacadeLocal;
    @Inject
    LoginBean loginBean;

    public String validarUsuario() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_CE");
        EntityManager em = emf.createEntityManager();

        try {

            Object result = em.createQuery("SELECT c FROM CeUsuario c WHERE c.usuusername = :usuusername and c.usupassword = :usupassword")
                    .setParameter("usuusername", loginBean.getUsuusername())
                    .setParameter("usupassword", loginBean.getUsupassword())
                    .getSingleResult();

            if (result != null) {

                return "/vistasCE/home?faces-redirect=true";

            } else {

                //FacesContext.getCurrentInstance()
                        //.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario o Contraseña Incorrectos"));


            }

        } catch (Exception e) {
        }

        return "/vistasCE/home.xhtml";

    }

    public LoginController() {
    }

    public CeUsuarioFacadeLocal getCeUsuarioFacadeLocal() {
        return ceUsuarioFacadeLocal;
    }

    public void setCeUsuarioFacadeLocal(CeUsuarioFacadeLocal ceUsuarioFacadeLocal) {
        this.ceUsuarioFacadeLocal = ceUsuarioFacadeLocal;
    }

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
}
