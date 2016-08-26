
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
@Table (name ="CEEQUIPOS")
public class CeEquipos implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipo;

    
    @Column(name = "EMPIDEMPLEADO")
    private int empIDEMPLEADO;
        
    
    @Column(name = "EQUMARCAE")
    private String equMARCAE;
    
    @Column(name = "EQUMODELO")
    private String equMODELO;
    
    @Column(name = "EQUNSE")
    private String equNSE;
    
    @Column(name = "EQUMARCAC")
    private String equMARCAC;
    
    @Column(name = "EQUNSC")
    private String equNSC;
    
    @Column(name = "EQUMEMORIA")
    private String equMEMORIA;
    
    @Column(name = "EQUDISCODURO")
    private String equDISCODURO;
    
    @Column(name = "EQUADICIONAL")
    private String equADICIONAL; 

    @Column(name = "EQUFECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equFECHAINICIO;
    
    @Column(name = "EQUFECHAFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equFECHAFIN;
    
    @Column(name = "EQUFECHACOMPRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date equFECHACOMPRA;

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public int getEmpIDEMPLEADO() {
        return empIDEMPLEADO;
    }

    public void setEmpIDEMPLEADO(int empIDEMPLEADO) {
        this.empIDEMPLEADO = empIDEMPLEADO;
    }

    public String getEquMARCAE() {
        return equMARCAE;
    }

    public void setEquMARCAE(String equMARCAE) {
        this.equMARCAE = equMARCAE;
    }

    public String getEquMODELO() {
        return equMODELO;
    }

    public void setEquMODELO(String equMODELO) {
        this.equMODELO = equMODELO;
    }

    public String getEquNSE() {
        return equNSE;
    }

    public void setEquNSE(String equNSE) {
        this.equNSE = equNSE;
    }

    public String getEquMARCAC() {
        return equMARCAC;
    }

    public void setEquMARCAC(String equMARCAC) {
        this.equMARCAC = equMARCAC;
    }

    public String getEquNSC() {
        return equNSC;
    }

    public void setEquNSC(String equNSC) {
        this.equNSC = equNSC;
    }

    public String getEquMEMORIA() {
        return equMEMORIA;
    }

    public void setEquMEMORIA(String equMEMORIA) {
        this.equMEMORIA = equMEMORIA;
    }

    public String getEquDISCODURO() {
        return equDISCODURO;
    }

    public void setEquDISCODURO(String equDISCODURO) {
        this.equDISCODURO = equDISCODURO;
    }

    public String getEquADICIONAL() {
        return equADICIONAL;
    }

    public void setEquADICIONAL(String equADICIONAL) {
        this.equADICIONAL = equADICIONAL;
    }

    public Date getEquFECHAINICIO() {
        return equFECHAINICIO;
    }

    public void setEquFECHAINICIO(Date equFECHAINICIO) {
        this.equFECHAINICIO = equFECHAINICIO;
    }

    public Date getEquFECHAFIN() {
        return equFECHAFIN;
    }

    public void setEquFECHAFIN(Date equFECHAFIN) {
        this.equFECHAFIN = equFECHAFIN;
    }

    public Date getEquFECHACOMPRA() {
        return equFECHACOMPRA;
    }

    public void setEquFECHACOMPRA(Date equFECHACOMPRA) {
        this.equFECHACOMPRA = equFECHACOMPRA;
    }

  

    
    
    
    
    
}
