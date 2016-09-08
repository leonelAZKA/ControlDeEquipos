package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.azka.controlDeEquipos.ejb.CeEmpleadoFacade;
import mx.azka.controlDeEquipos.ejb.CeEquiposFacade;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeEquipos;


@Named(value = "home")
@ViewScoped
public class homeController implements Serializable {

    @EJB
    private CeEmpleadoFacade ceEmpleadoFacade;
    @EJB
    private CeEquiposFacade ceEquiposFacade;
    
    
    private CeEmpleado ceEmpleado;
    private CeEquipos ceEquipos;

    public CeEmpleado getCeEmpleado() {
        return ceEmpleado;
    }

    public void setCeEmpleado(CeEmpleado ceEmpleado) {
        this.ceEmpleado = ceEmpleado;
    }

    public CeEquipos getCeEquipos() {
        return ceEquipos;
    }

    public void setCeEquipos(CeEquipos ceEquipos) {
        this.ceEquipos = ceEquipos;
    }

    public homeController() {
    }

    public List<CeEmpleado> getAll() {
        return ceEmpleadoFacade.findAll();
    }
    public List<CeEquipos>getAllEq(){
            return ceEquiposFacade.findAll();
    }
       
        
      
        
    
            
        
       
      
        
        
}
