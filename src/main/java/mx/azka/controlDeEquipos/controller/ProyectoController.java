
package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import javax.ejb.EJB;
import mx.azka.controlDeEquipos.ejb.CeProyectoFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeProyecto;

@EJB (name="ProyectoController")
public class ProyectoController implements Serializable{
    private CeProyectoFacadeLocal proyectoEjb;
    private CeProyecto ceProyecto;
    
    public void registrar(){
        try{
            proyectoEjb.create(ceProyecto);
        }catch(Exception e){
            
        }
    }
}
