
package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import mx.azka.controlDeEquipos.ejb.CeEmpleadoFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
@Named
@ViewScoped
public class DetalleEmpleado implements Serializable{
    @EJB
    private CeEmpleadoFacadeLocal ceEmpleadoEjb;
    private CeEmpleado ceEmpleado;

    public CeEmpleado getCeEmpleado() {
        return ceEmpleado;
    }

    public void setCeEmpleado(CeEmpleado ceEmpleado) {
        this.ceEmpleado = ceEmpleado;
    }
    
    public void actualizar(){
        try{
            System.out.println("Entra a modificar detalle empleado");
            ceEmpleadoEjb.edit(ceEmpleado);
        }catch(Exception e){
            
        }
    }
    
    @PostConstruct
    public void init(){
        ceEmpleado = new CeEmpleado();
    }
    
    public void eliminar(){
        try{
            System.out.println("Entra a eliminar detalle empleado");
            ceEmpleadoEjb.remove(ceEmpleado);
        }catch(Exception e){
            
        }
    }
    
}
