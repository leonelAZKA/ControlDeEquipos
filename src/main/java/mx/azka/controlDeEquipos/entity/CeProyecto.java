
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
@Table (name = "CEPROYECTO")
public class CeProyecto  implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int proIdProyecto;
    @Column (name="PRODESCRIPCION")
    private String proDescripcion;

    public int getProIdProyecto() {
        return proIdProyecto;
    }

    public void setProIdProyecto(int proIdProyecto) {
        this.proIdProyecto = proIdProyecto;
    }

    public String getProDescripcion() {
        return proDescripcion;
    }

    public void setProDescripcion(String proDescripcion) {
        this.proDescripcion = proDescripcion;
    }
    

}
