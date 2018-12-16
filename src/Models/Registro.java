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
public class Registro {
    private int id;
    private Date FechaRegistro;
    private String CategoriaEstudio;
    private String TurnoEstudio;
    private String Descripcion;
    private int IdUsuario;

    public Registro(int id, Date FechaRegistro,String CategoriaEstudio, String TurnoEstudio, String Descripcion, int IdUsuario) {
        this.id = id;
        this.FechaRegistro = FechaRegistro;
        this.CategoriaEstudio=CategoriaEstudio;
        this.TurnoEstudio = TurnoEstudio;
        this.Descripcion = Descripcion;
        this.IdUsuario = IdUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public String getCategoriaEstudio() {
        return CategoriaEstudio;
    }

    public void setCategoriaEstudio(String CategoriaEstudio) {
        this.CategoriaEstudio = CategoriaEstudio;
    }

    public String getTurnoEstudio() {
        return TurnoEstudio;
    }

    public void setTurnoEstudio(String TurnoEstudio) {
        this.TurnoEstudio = TurnoEstudio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    
    
}
