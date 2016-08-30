package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import mx.azka.controlDeEquipos.ejb.CeProyectoFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeProyecto;


@Named
@ViewScoped
public class ProyectoController implements Serializable{
    
    @EJB
    private CeProyectoFacadeLocal proyectoEjb;
    private CeProyecto ceProyecto;

    public CeProyecto getCeProyecto() {
        return ceProyecto;
    }

    public void setCeProyecto(CeProyecto ceProyecto) {
        this.ceProyecto = ceProyecto;
    }
    
    @PostConstruct
    public void init(){
        ceProyecto = new CeProyecto();
    }
    
    public void registrar(){
        try{
            System.out.println("entra a registrar");
            proyectoEjb.create(ceProyecto);
        }catch(Exception e){
            
        }
    }
}
