/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class Materia {
    private int id;
    private String Nombre;
    private String Descripcion;
    private String Otros;
    public Materia(int id, String Nombre, String Descripcion, String Otros) {
        this.id = id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Otros = Otros;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getOtros() {
        return Otros;
    }

    public void setOtros(String Otros) {
        this.Otros = Otros;
    }
    
}
