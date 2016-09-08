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

import mx.azka.controlDeEquipos.ejb.CeUsuarioFacadeLocal;
import mx.azka.controlDeEquipos.entity.CeEmpleado;

import mx.azka.controlDeEquipos.entity.CeUsuario;

@Named
@ViewScoped
public class DetalleUsuarioController implements Serializable{
    
 @EJB
    private CeUsuarioFacadeLocal usuarioEjb;
 @EJB
    private CeEmpleadoFacadeLocal empleadoEjb;
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