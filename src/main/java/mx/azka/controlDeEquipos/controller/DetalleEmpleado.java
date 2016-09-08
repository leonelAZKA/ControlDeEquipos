
package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import mx.azka.controlDeEquipos.ejb.CeEmpleadoFacade;
import mx.azka.controlDeEquipos.ejb.CeProyectoFacade;

import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeProyecto;
@Named
@ViewScoped
public class DetalleEmpleado implements Serializable{
    @EJB
    private CeEmpleadoFacade ceEmpleadoEjb;
    @EJB
    private CeProyectoFacade ceProyectoEjb;
    private CeEmpleado ceEmpleado;
    private List< SelectItem> listProy;
    private CeProyecto ceProyecto;
    private int idProy;

    public CeProyecto getCeProyecto() {
        return ceProyecto;
    }

    public void setCeProyecto(CeProyecto ceProyecto) {
        this.ceProyecto = ceProyecto;
    }

    public CeEmpleado getCeEmpleado() {
        return ceEmpleado;
    }

    public void setCeEmpleado(CeEmpleado ceEmpleado) {
        this.ceEmpleado = ceEmpleado;
    }
    
    public List<SelectItem> getAllProyecto(){
        Iterator<CeProyecto> pr = ceProyectoEjb.findAll().iterator();
        listProy = new ArrayList<SelectItem>();
        while(pr.hasNext()){
            CeProyecto proy = pr.next();
            listProy.add(new SelectItem(proy.getProidproyecto(), proy.getProdescripcion()));
        }
        return listProy;
    }
    
    public void actualizar(){
        try{
            System.out.println("Entra a modificar detalle empleado, idproy: "+ idProy);
            if(ceEmpleadoEjb.find(ceEmpleado.getEmpidempleado())==null){
                //ceEmpleado.setEmpIdProyecto(idProy);
                ceEmpleadoEjb.create(ceEmpleado);
            }else{
                System.out.println("Entra a modificar detalle empleado, id proy" + idProy);
                //ceEmpleado.setEmpIdProyecto(idProy);
                ceEmpleadoEjb.edit(ceEmpleado);
            }
            
        }catch(Exception e){
            
        }
    }
    
    @PostConstruct
    public void init(){
        ceEmpleado = new CeEmpleado();
        ceProyecto = new CeProyecto();
    }
    
    public void eliminar(){
        try{
            System.out.println("Entra a eliminar detalle empleado");
            ceEmpleadoEjb.remove(ceEmpleado);
        }catch(Exception e){
            
        }
    }
    
}
