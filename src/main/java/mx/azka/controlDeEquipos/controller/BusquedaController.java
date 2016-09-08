/*
package mx.azka.controlDeEquipos.controller;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.sql.DataSource;
import mx.azka.controlDeEquipos.entity.CeEmpleado;
import mx.azka.controlDeEquipos.entity.CeEquipos;

@ManagedBean (name = "homeController")
@ViewScoped
public class BusquedaController implements Serializable {
        @EJB
        CeEmpleado elEmpleado;
        CeEquipos elEquipo;

        private Query miConsulta;
        private String laOpcion;
        private List listaResultado;
    
    public BusquedaController(){     
              
    }
    
    
    @Resource(name = "jdbc/CePool")
    private DataSource ds;
   
    public List <CeEquipos> obtenEmpleadoEquipo() throws SQLException {    
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_CE");
        EntityManager em = emf.createEntityManager();
        
        try {
            Connection conexion;
            conexion = ds.getConnection();
            //todo: un if donde lea la opcion del cuadro de texto del home y 
            //determine si metio un String o un valor entero
            laOpcion = request.getParameter("variable"); //se supone que toma el dato del inputBox de la vista home
            
            if (isNumeric(laOpcion) == true) {
                int variable = Integer.parseInt(laOpcion);
                //Object resultado = em.createQuery("SELECT DISTINCT ceEQUIPOS.EQUID, ceEMPLEADO.EMPIDEMPLEADO, ceEMPLEADO.EMPNOMBRE, ceEQUIPOS.EQUMARCAE, ceEQUIPOS.EQUMODELO, ceEQUIPOS.EQUNSE, ceEQUIPOS.EQUMARCAC, ceEQUIPOS.EQUNSC, ceEQUIPOS.EQUMEMORIA , ceEQUIPOS.EQUDISCO_DURO, ceEQUIPOS.EQUADICIONAL, ceEQUIPOS.EQUFECHA_INICIO, ceEQUIPOS.EQUFECHA_FIN, ceEQUIPOS.EQUFECHA_COMPRA FROM CEEMPLEADO,ceEQUIPOS WHERE ceEMPLEADO.EMPIDEMPLEADO = :laOpcion AND ceEMPLEADO.EMPIDEMPLEADO=ceEQUIPOS.CEEMPLEADO_EMPIDEMPLEADO")
                    //.setParameter("empIDEMPLEADO", laOpcion)
                    //.getResultList();
               miConsulta = em.createQuery("SELECT DISTINCT ceEQUIPOS.EQUID, ceEMPLEADO.EMPIDEMPLEADO, ceEMPLEADO.EMPNOMBRE, ceEQUIPOS.EQUMARCAE, ceEQUIPOS.EQUMODELO, ceEQUIPOS.EQUNSE, ceEQUIPOS.EQUMARCAC, ceEQUIPOS.EQUNSC, ceEQUIPOS.EQUMEMORIA , ceEQUIPOS.EQUDISCO_DURO, ceEQUIPOS.EQUADICIONAL, ceEQUIPOS.EQUFECHA_INICIO, ceEQUIPOS.EQUFECHA_FIN, ceEQUIPOS.EQUFECHA_COMPRA FROM CEEMPLEADO,ceEQUIPOS WHERE ceEMPLEADO.EMPIDEMPLEADO = :laOpcion AND ceEMPLEADO.EMPIDEMPLEADO=ceEQUIPOS.CEEMPLEADO_EMPIDEMPLEADO");
               miConsulta.setParameter("empIDEMPLEADO", laOpcion);
                            
            }
            else {
                //Object result = em.createQuery("SELECT DISTINCT ceEQUIPOS.EQUID, ceEMPLEADO.EMPIDEMPLEADO, ceEMPLEADO.EMPNOMBRE, ceEQUIPOS.EQUMARCAE, ceEQUIPOS.EQUMODELO, ceEQUIPOS.EQUNSE, ceEQUIPOS.EQUMARCAC, ceEQUIPOS.EQUNSC, ceEQUIPOS.EQUMEMORIA , ceEQUIPOS.EQUDISCO_DURO, ceEQUIPOS.EQUADICIONAL, ceEQUIPOS.EQUFECHA_INICIO, ceEQUIPOS.EQUFECHA_FIN, ceEQUIPOS.EQUFECHA_COMPRA FROM CEEMPLEADO,ceEQUIPOS WHERE ceEMPLEADO.EMPNOMBRE LIKE ':laOpcion' AND ceEMPLEADO.EMPIDEMPLEADO=ceEQUIPOS.CEEMPLEADO_EMPIDEMPLEADO")
                    //.setParameter("empNOMBRE", laOpcion)
                    //.getResultList();             
               miConsulta = em.createQuery("SELECT DISTINCT ceEQUIPOS.EQUID, ceEMPLEADO.EMPIDEMPLEADO, ceEMPLEADO.EMPNOMBRE, ceEQUIPOS.EQUMARCAE, ceEQUIPOS.EQUMODELO, ceEQUIPOS.EQUNSE, ceEQUIPOS.EQUMARCAC, ceEQUIPOS.EQUNSC, ceEQUIPOS.EQUMEMORIA , ceEQUIPOS.EQUDISCO_DURO, ceEQUIPOS.EQUADICIONAL, ceEQUIPOS.EQUFECHA_INICIO, ceEQUIPOS.EQUFECHA_FIN, ceEQUIPOS.EQUFECHA_COMPRA FROM CEEMPLEADO,ceEQUIPOS WHERE ceEMPLEADO.EMPNOMBRE LIKE ':laOpcion' AND ceEMPLEADO.EMPIDEMPLEADO=ceEQUIPOS.CEEMPLEADO_EMPIDEMPLEADO");
               miConsulta.setParameter("empNOMBRE", laOpcion);
               
            }
            listaResultado = miConsulta.getResultList();
            
        } 
        catch (SQLException e) {
            System.out.println("SIN CONEXION A LA BASE DE DATOS" + e);
        }
            return listaResultado;
   
    }
    
    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
}
*/