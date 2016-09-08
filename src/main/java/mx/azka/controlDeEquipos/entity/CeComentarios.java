
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class CeComentarios implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comID;
    
    @Column(name = "USUIDUSUARIO")
    private int usuIDUSUARIO;
    
    @Column(name = "EMPIDEMPLEADO")
    private int empIDEMPLEADO;
    
    @Column(name = "EQUID")
    private int equID;

    @Column(name = "COMCOMENTARIO")
    private String comCOMENTARIO;
    
    @Column(name = "COMFECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date comFECHA;

    public int getComID() {
        return comID;
    }

    public void setComID(int comID) {
        this.comID = comID;
    }

    public int getUsuIDUSUARIO() {
        return usuIDUSUARIO;
    }

    public void setUsuIDUSUARIO(int usuIDUSUARIO) {
        this.usuIDUSUARIO = usuIDUSUARIO;
    }

    public int getEmpIDEMPLEADO() {
        return empIDEMPLEADO;
    }

    public void setEmpIDEMPLEADO(int empIDEMPLEADO) {
        this.empIDEMPLEADO = empIDEMPLEADO;
    }

    public String getComCOMENTARIO() {
        return comCOMENTARIO;
    }

    public void setComCOMENTARIO(String comCOMENTARIO) {
        this.comCOMENTARIO = comCOMENTARIO;
    }

        public int getEquID() {
        return equID;
    }

    public void setEquID(int equID) {
        this.equID = equID;
    }
    
    public Date getComFECHA() {
        return comFECHA;
    }

    public void setComFECHA(Date comFECHA) {
        this.comFECHA = comFECHA;
    }
    
}
