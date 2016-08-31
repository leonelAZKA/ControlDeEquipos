package mx.azka.controlDeEquipos.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import mx.azka.controlDeEquipos.ejb.CeEquiposFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeEquipos;

@Named
@ViewScoped
public class DetalleEquipoController {
 @EJB
    private CeEquiposFacadeLocal equiposEjb;
    private CeEquipos equipos;

    public CeEquipos getEquipos() {
        return equipos;
    }

    public void setEquipos(CeEquipos equipos) {
        this.equipos = equipos;
    }
      
    @PostConstruct
    public void init(){
        equipos = new CeEquipos();
    }
    
 
 
  public void editar(){
        try{
            System.out.println("entra a registrar");
            equiposEjb.edit(equipos);
        }catch(Exception e){
            //
        }
    }
 public void remove(){
        try{
            System.out.println("entra a registrar");
            equiposEjb.remove(equipos);
        }catch(Exception e){
            //
        }
    }
 
 
 
    
}
