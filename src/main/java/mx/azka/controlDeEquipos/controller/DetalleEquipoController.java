package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import java.util.ArrayList;
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
    private CeEmpleado ceEmpelado;
    private int idemp;

    public CeEmpleado getCeEmpelado() {
        return ceEmpelado;
    }

    public void setCeEmpelado(CeEmpleado ceEmpelado) {
        this.ceEmpelado = ceEmpelado;
    }
   
    private List< SelectItem> listEmpleados;
    public CeEquipos getEquipos() {
        return equipos;
    }
    

  
    
 public List<SelectItem> getAllempleados() {
            List<CeEmpleado> al = empleadoEjb.findAll();
            listEmpleados = new ArrayList< SelectItem>();
            int i = 0;
            for (CeEmpleado empleado: al) {
                listEmpleados.add(new SelectItem(i, empleado.getEmpNombre()+ " "+ empleado.getEmpAppPaterno()+" "+empleado.getEmpAppMaterno()));
                idemp=empleado.getEmpIdEmpleado();
                i++;
            }
            return listEmpleados;
    }
 
 
     public void setEquipos(CeEquipos equipos) {
        this.equipos = equipos;
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
          equipos.setEmpIDEMPLEADO(idemp);
          equiposEjb.create(equipos);
      }
      else
      {
           System.out.println("Entra a modificar detalle empleado");
            equipos.setEmpIDEMPLEADO(idemp);
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