/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author acher
 */
public class Evaluacion_Profesor {
    private int id;
    private String descripcion;
    private int idMateriaProfesor;
    private int idTiempoEvaluacion;
    
    public Evaluacion_Profesor(int id, String descripcion, int idmateprof, int idtiempoeva){
        this.id=id;
        this.descripcion=descripcion;
        this.idMateriaProfesor=idmateprof;
        this.idTiempoEvaluacion=idtiempoeva;
    }
    
    public int getId(){
    
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public int getIdMateriaProfesor()
    {
        return this.idMateriaProfesor;
    }
    public void setIdMateriaProfesor(int idmateprof)
    {
        this.idMateriaProfesor=idmateprof;
    }
    
    public int getIdTiempoEvaluacion(){
        return this.idTiempoEvaluacion;
    }
    public void setIdTiempoEvaluacion(int idtiempoeva){
        this.idTiempoEvaluacion=idtiempoeva;
    }
}
