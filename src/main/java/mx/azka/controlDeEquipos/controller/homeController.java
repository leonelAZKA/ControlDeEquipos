package mx.azka.controlDeEquipos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.view.ViewScoped;

import javax.inject.Named;

import mx.azka.controlDeEquipos.ejb.CeEquiposFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeEquipos;

@Named
@ViewScoped
public class homeController {
   @EJB
   private CeEquiposFacadeLocal service;
   
    private CeEmpleado ceEmpleado;

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
    private CeEquipos ceEquipos;


   
        public List<CeEquipos> getAll() {
        return service.findAll();
    }
         
    
}
