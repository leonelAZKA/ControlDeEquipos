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
<<<<<<< Updated upstream
    private List<SelectItem> listEmpleados;
    private int idemp;
    
=======
    private int idemp;
>>>>>>> Stashed changes

 
    public CeEmpleado getCeEmpelado() {
        return ceEmpelado;
    }

    public void setCeEmpelado(CeEmpleado ceEmpelado) {
        this.ceEmpelado = ceEmpelado;
    }
   

    

  
    
 public List<SelectItem> getAllempleados() {

            Iterator<CeEmpleado> iterator= empleadoEjb.findAll().iterator();
            listEmpleados = new ArrayList< SelectItem>();
<<<<<<< Updated upstream
           while(iterator.hasNext()){
CeEmpleado ce=iterator.next();

listEmpleados.add(new SelectItem(ce.getEmpIdEmpleado(), ce.getEmpNombre()+ " " + ce.getEmpAppPaterno()+ " " + ce.getEmpAppMaterno()));
}
            
=======
            int i = 0;
            for (CeEmpleado empleado: al) {
                listEmpleados.add(new SelectItem(ceEmpelado()));
                i++;
                
            }
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    
=======
          equipos.setEmpIDEMPLEADO(idemp);
>>>>>>> Stashed changes
          equiposEjb.create(equipos);
      }
      else
      {
           System.out.println("Entra a modificar detalle empleado");
<<<<<<< Updated upstream
     
=======
            equipos.setEmpIDEMPLEADO(idemp);
>>>>>>> Stashed changes
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

    private Object ceEmpelado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

	
 
 
    
}