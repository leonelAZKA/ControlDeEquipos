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
import mx.azka.controlDeEquipos.ejb.CeEmpleadoFacadeLocal;
import mx.azka.controlDeEquipos.ejb.CeEquiposFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeEquipos;

@Named
@ViewScoped
public class DetalleEquipoController implements Serializable{
    
 @EJB
    private CeEquiposFacadeLocal equiposEjb;
 @EJB
    private CeEmpleadoFacadeLocal empleadoEjb;
    private CeEquipos equipos;

    public CeEquipos getEquipos() {
        return equipos;
    }

    public void setEquipos(CeEquipos equipos) {
        this.equipos = equipos;
    }
    private CeEmpleado ceEmpelado;

    private List<SelectItem> listEmpleados;

    

   


 
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

listEmpleados.add(new SelectItem(ce.getEmpIdEmpleado(), ce.getEmpNombre()+ " " + ce.getEmpAppPaterno()+ " " + ce.getEmpAppMaterno()));

                
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
             System.out.println(equipos.getEquID());
      if(equipos.getEquID()==0){

  

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
         equipos.setEmpIDEMPLEADO(155);
            equiposEjb.remove(equipos);
        }catch(Exception e){
            //
        }
     
     

    }

}
 

	