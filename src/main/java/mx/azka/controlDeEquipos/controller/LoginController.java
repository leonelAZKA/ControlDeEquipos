package mx.azka.controlDeEquipos.controller;


import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.azka.controlDeEquipos.bo.CeUsuarioBean;
import mx.azka.controlDeEquipos.ejb.CeUsuarioFacade;
import mx.azka.controlDeEquipos.entity.CeUsuario;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginController implements Serializable {

    @EJB
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

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_CE");
        EntityManager em = emf.createEntityManager();

        try {


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
    }
}
