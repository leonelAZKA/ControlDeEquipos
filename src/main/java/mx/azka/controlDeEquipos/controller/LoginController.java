package mx.azka.controlDeEquipos.controller;

<<<<<<< Updated upstream

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
=======
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
>>>>>>> Stashed changes
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
<<<<<<< Updated upstream
import mx.azka.controlDeEquipos.bo.CeUsuarioBean;
import mx.azka.controlDeEquipos.ejb.CeUsuarioFacade;
import mx.azka.controlDeEquipos.entity.CeUsuario;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "loginBean")
=======
import mx.azka.controlDeEquipos.ejb.CeUsuarioFacadeLocal;
import org.primefaces.context.RequestContext;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "loginController")
>>>>>>> Stashed changes
@SessionScoped
public class LoginController implements Serializable {

    @EJB
<<<<<<< Updated upstream
    CeUsuarioFacade ceUsuarioFacade;
    @Inject
    CeUsuarioBean ceUsuarioBean;
    private String usuusername;
    private String usupassword;

    public LoginController() {
    }

    public List<CeUsuario> getAll() {
        return ceUsuarioFacade.findAll();
    }

    public int count() {
        return ceUsuarioFacade.count();
    }

    public String delete(CeUsuario ce) {
        ceUsuarioFacade.remove(ce);
        return null;

    }

    public String validarUsuario() {

=======
    CeUsuarioFacadeLocal ceUsuarioFacadeLocal;
    @Inject
    LoginBean loginBean;

    public String validarUsuario() {
>>>>>>> Stashed changes
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_CE");
        EntityManager em = emf.createEntityManager();

        try {

<<<<<<< Updated upstream

            Object result = em.createQuery("SELECT c FROM CeUsuario c WHERE c.usuusername = :usuusername and c.usupassword = :usupassword")
                    .setParameter("usuusername", usuusername)
                    .setParameter("usupassword", usupassword)
                    .getSingleResult();

            if (result == null) {

                return "/vistasCE/error?faces-redirect=true";
            } else {

                RequestContext.getCurrentInstance().update("growl");
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Corregir usuario o contraseña"));

                return "/vistasCE/home?faces-redirect=true";
            }

        } catch (Exception e) {
        } finally {
            em.clear();
            em.close();

        }

        return "/vistasCE/error?faces-redirect=true";

    }

    public String getUsuusername() {
        return usuusername;
    }

    public void setUsuusername(String usuusername) {
        this.usuusername = usuusername;
    }

    public String getUsupassword() {
        return usupassword;
    }

    public void setUsupassword(String usupassword) {
        this.usupassword = usupassword;
=======
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
>>>>>>> Stashed changes
    }
}
