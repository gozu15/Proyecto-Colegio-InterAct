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
public class Curso_Materia {
    private int id;
    private int idMateria;
    private int idCurso;
    
    public Curso_Materia(int id, int idmateria,int idcurso){
        this.id=id;
        this.idMateria=idmateria;
        this.idCurso=idcurso;
    }
    
    public int getId()
    {
        return this.id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    
    public int getIdMateria()
    {
        return this.idMateria;
    }
    public void setIdMateria(int idmate)
    {
        this.idMateria=idmate;
    }
    
    public int getIdCurso(){
        return this.idCurso;
    }
    public void setIdCurso(int idcur){
        this.idCurso = idcur;
    }
    
    
}
