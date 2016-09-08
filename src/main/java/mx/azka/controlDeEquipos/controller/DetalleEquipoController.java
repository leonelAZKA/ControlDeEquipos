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

import mx.azka.controlDeEquipos.ejb.CeEquiposFacade;

import mx.azka.controlDeEquipos.entity.CeEmpleado;

import mx.azka.controlDeEquipos.entity.CeEquipos;

@Named
@ViewScoped
public class DetalleEquipoController implements Serializable{
    
 @EJB

    private CeEquiposFacade equiposEjb;
 @EJB
    private CeEmpleadoFacade empleadoEjb;

    private CeEquipos equipos;

    public CeEquipos getEquipos() {
        return equipos;
    }

    public void setEquipos(CeEquipos equipos) {
        this.equipos = equipos;
    }
    private CeEmpleado ceEmpelado;

    private List<SelectItem> listEmpleados;
    private int idemp;
    


 
    public CeEmpleado getCeEmpelado() {
        return ceEmpelado;
    }

    public void setCeEmpelado(CeEmpleado ceEmpelado) {
        this.ceEmpelado = ceEmpelado;
    }
   

    

  
    
 public List<SelectItem> getAllempleados() {

            Iterator<CeEmpleado> iterator= empleadoEjb.findAll().iterator();
            listEmpleados = new ArrayList< SelectItem>();

           while(iterator.hasNext()){
CeEmpleado ce=iterator.next();

listEmpleados.add(new SelectItem(ce.getEmpidempleado(), ce.getEmpnombre()+ " " + ce.getEmpappPaterno()+ " " + ce.getEmpappMaterno()));
}
            
            return listEmpleados;
    }
   

      
    @PostConstruct
    public void init(){
        equipos = new CeEquipos();
        ceEmpelado = new CeEmpleado();
        
    }

  public void guardar(){
  
        try{
             System.out.println(equipos.getEquid());
      if(equipos.getEquid()==null){

          equiposEjb.create(equipos);
      }
      else
      {
           System.out.println("Entra a modificar detalle empleado");

          equiposEjb.edit(equipos);
      }
        }catch(Exception e){
            //
        }
    }
 public void eliminar(){
        try{
        
            equiposEjb.remove(equipos);
        }catch(Exception e){
            //
        }

     
     

    }

   
 

	
 
 

    } 

    
