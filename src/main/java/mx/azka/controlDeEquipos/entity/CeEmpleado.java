
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Azka IT Consulting
 */

@Entity
@Table (name = "CEEMPLEADO")
public class CeEmpleado implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int empIdEmpleado;
    @Column (name="EMPNOMBRE")
    private String empNombre;
    @Column (name="EMPAPP_PATERNO")
    private String empAppPaterno;
    @Column (name="EMPAPP_MATERNO")
    private String empAppMaterno;
    @Column (name="EMPIDPROYECTO")
    private int empIdProyecto;

    public int getEmpIdEmpleado() {
        return empIdEmpleado;
    }

    public void setEmpIdEmpleado(int empIdEmpleado) {
        this.empIdEmpleado = empIdEmpleado;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpAppPaterno() {
        return empAppPaterno;
    }

    public void setEmpAppPaterno(String empAppPaterno) {
        this.empAppPaterno = empAppPaterno;
    }

    public String getEmpAppMaterno() {
        return empAppMaterno;
    }

    public void setEmpAppMaterno(String empAppMaterno) {
        this.empAppMaterno = empAppMaterno;
    }

    public int getEmpIdProyecto() {
        return empIdProyecto;
    }

    public void setEmpIdProyecto(int empIdProyecto) {
        this.empIdProyecto = empIdProyecto;
    }
    
    
}
