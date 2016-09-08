/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.azka.controlDeEquipos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 @Entity
 @Table (name = "CEPERMISOS")
public class CePermisos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int perid;
    
    @Column (name="PERNOMBRE")
    private String pernombre;
    
    @Column (name="PERURL")
    private String perurl;
    
    @Column (name="PERTIPO")
    private String pertipo;
    
    @Column (name="PERDEPARTAMENTO")
    private String perdepartamento;
    
    @Column (name="PERCODIGOSUBMENU")
    private int percodigosubmenu;
    
    @Column (name="PER ESTADO")
    private String perestado;

    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getPernombre() {
        return pernombre;
    }

    public void setPernombre(String pernombre) {
        this.pernombre = pernombre;
    }

    public String getPerurl() {
        return perurl;
    }

    public void setPerurl(String perurl) {
        this.perurl = perurl;
    }

    public String getPertipo() {
        return pertipo;
    }

    public void setPertipo(String pertipo) {
        this.pertipo = pertipo;
    }

    public String getPerdepartamento() {
        return perdepartamento;
    }

    public void setPerdepartamento(String perdepartamento) {
        this.perdepartamento = perdepartamento;
    }

    public int getPercodigosubmenu() {
        return percodigosubmenu;
    }

    public void setPercodigosubmenu(int percodigosubmenu) {
        this.percodigosubmenu = percodigosubmenu;
    }

    public String getPerestado() {
        return perestado;
    }

    public void setPerestado(String perestado) {
        this.perestado = perestado;
    }
    
    
}
