/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class TomaMaterias {
    private int id;
    private Date Fecha;
    private int IdGestion;
    private int IdRegistro;

    public TomaMaterias(int id, Date Fecha, int IdGestion, int IdRegistro) {
        this.id = id;
        this.Fecha = Fecha;
        this.IdGestion = IdGestion;
        this.IdRegistro = IdRegistro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdGestion() {
        return IdGestion;
    }

    public void setIdGestion(int IdGestion) {
        this.IdGestion = IdGestion;
    }

    public int getIdRegistro() {
        return IdRegistro;
    }

    public void setIdRegistro(int IdRegistro) {
        this.IdRegistro = IdRegistro;
    }
    
    
}
