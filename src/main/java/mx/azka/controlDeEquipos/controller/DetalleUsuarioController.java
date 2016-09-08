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

import mx.azka.controlDeEquipos.ejb.CeusuarioFacade;
import mx.azka.controlDeEquipos.entity.CeEmpleado;

import mx.azka.controlDeEquipos.entity.CeUsuario;

@Named
@ViewScoped
public class DetalleUsuarioController implements Serializable{
    
 @EJB
    private CeusuarioFacade usuarioEjb;
 @EJB
    private CeEmpleadoFacade empleadoEjb;
    private CeUsuario usuario;

    public CeUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(CeUsuario usuario) {
        this.usuario = usuario;
    }
   
    private int idemp;
   
    private List< SelectItem> listEmpleados;
  

  
    
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
        usuario = new CeUsuario();
        
    }

  public void guardar(){
        try{
        
      if(usuario.getIdusuario()==0){
          
          usuarioEjb.create(usuario);
      }
      else
      {
           System.out.println("Entra a modificar detalle empleado");
          usuarioEjb.edit(usuario);
      }
        }catch(Exception e){
            //
        }
    }

 public void eliminar(){
        try{
            usuarioEjb.remove(usuario);
        }catch(Exception e){
            //
        }
        
     

    }
 

	
 
 
    
}