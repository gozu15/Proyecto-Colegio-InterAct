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
public class Usuario {
     private int id;
    private String Nombre;
    private String Apellidos;
    private String Carnet;
    private String Genero;
    private Date FechaNacimiento;
    private String TipoDeUsuario;

    public Usuario(int id, String Nombre, String Apellidos, String Carnet, String Genero, Date FechaNacimiento, String TipoDeUsuario) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Carnet=Carnet;
        this.Genero = Genero;
        this.FechaNacimiento = FechaNacimiento;
        this.TipoDeUsuario = TipoDeUsuario;
    }

    public String getCarnet() {
        return Carnet;
    }

    public void setCarnet(String Carnet) {
        this.Carnet = Carnet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTipoDeUsuario() {
        return TipoDeUsuario;
    }

    public void setTipoDeUsuario(String TipoDeUsuario) {
        this.TipoDeUsuario = TipoDeUsuario;
    }
    
    
}
