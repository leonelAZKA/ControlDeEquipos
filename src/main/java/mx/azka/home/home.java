package mx.azka.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.servlet.jsp.tagext.TryCatchFinally;
import javax.sql.DataSource;


public class home {
    
    private String empIdEmpleado;
    private String empNombre;
    private String empAPP_PATERNO;
    private String empAPP_mATERNO;
    private int proID;
    
    private int equID;
    private int equAdicional;
    private String equDisco_Duro;
    private String equFechaCompra;
    private String equFechaInicio;
    private String equFechaFin;
    private String equMarcaEquipo;
    private String equMarcaCargador;
    private String equMemoria;
    private String equModelo;
    private String equNumeroSerieEquipo;
    private String equNumeroSerieCargador;
    private int ceEquipoIdEmpleado;

    public String getEmpIdEmpleado() {
        return empIdEmpleado;
    }

    public void setEmpIdEmpleado(String empIdEmpleado) {
        this.empIdEmpleado = empIdEmpleado;
    }

    public String getEmpNombre() {
        return empNombre;
    }

    public void setEmpNombre(String empNombre) {
        this.empNombre = empNombre;
    }

    public String getEmpAPP_PATERNO() {
        return empAPP_PATERNO;
    }

    public void setEmpAPP_PATERNO(String empAPP_PATERNO) {
        this.empAPP_PATERNO = empAPP_PATERNO;
    }

    public String getEmpAPP_mATERNO() {
        return empAPP_mATERNO;
    }

    public void setEmpAPP_mATERNO(String empAPP_mATERNO) {
        this.empAPP_mATERNO = empAPP_mATERNO;
    }

    public int getProID() {
        return proID;
    }

    public void setProID(int proID) {
        this.proID = proID;
    }

    public int getEquID() {
        return equID;
    }

    public void setEquID(int equID) {
        this.equID = equID;
    }

    public int getEquAdicional() {
        return equAdicional;
    }

    public void setEquAdicional(int equAdicional) {
        this.equAdicional = equAdicional;
    }

    public String getEquDisco_Duro() {
        return equDisco_Duro;
    }

    public void setEquDisco_Duro(String equDisco_Duro) {
        this.equDisco_Duro = equDisco_Duro;
    }

    public String getEquFechaCompra() {
        return equFechaCompra;
    }

    public void setEquFechaCompra(String equFechaCompra) {
        this.equFechaCompra = equFechaCompra;
    }

    public String getEquFechaInicio() {
        return equFechaInicio;
    }

    public void setEquFechaInicio(String equFechaInicio) {
        this.equFechaInicio = equFechaInicio;
    }

    public String getEquFechaFin() {
        return equFechaFin;
    }

    public void setEquFechaFin(String equFechaFin) {
        this.equFechaFin = equFechaFin;
    }

    public String getEquMarcaEquipo() {
        return equMarcaEquipo;
    }

    public void setEquMarcaEquipo(String equMarcaEquipo) {
        this.equMarcaEquipo = equMarcaEquipo;
    }

    public String getEquMarcaCargador() {
        return equMarcaCargador;
    }

    public void setEquMarcaCargador(String equMarcaCargador) {
        this.equMarcaCargador = equMarcaCargador;
    }

    public String getEquMemoria() {
        return equMemoria;
    }

    public void setEquMemoria(String equMemoria) {
        this.equMemoria = equMemoria;
    }

    public String getEquModelo() {
        return equModelo;
    }

    public void setEquModelo(String equModelo) {
        this.equModelo = equModelo;
    }

    public String getEquNumeroSerieEquipo() {
        return equNumeroSerieEquipo;
    }

    public void setEquNumeroSerieEquipo(String equNumeroSerieEquipo) {
        this.equNumeroSerieEquipo = equNumeroSerieEquipo;
    }

    public String getEquNumeroSerieCargador() {
        return equNumeroSerieCargador;
    }

    public void setEquNumeroSerieCargador(String equNumeroSerieCargador) {
        this.equNumeroSerieCargador = equNumeroSerieCargador;
    }

    public int getCeEquipoIdEmpleado() {
        return ceEquipoIdEmpleado;
    }

    public void setCeEquipoIdEmpleado(int ceEquipoIdEmpleado) {
        this.ceEquipoIdEmpleado = ceEquipoIdEmpleado;
    }

    public home() {
    }
    
    
    

           
        
        
    
}
