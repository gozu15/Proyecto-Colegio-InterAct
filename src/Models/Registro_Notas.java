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
public class Registro_Notas {
    private int Id;
    private String nota;
    private int idMateriaStudiante;
    
    public Registro_Notas(int id, String nota, int idmateriaestu){
        this.Id=id;
        this.nota = nota;
        this.idMateriaStudiante=idmateriaestu;
    }
    
    public int getid(){
        return this.Id;
    }
    public void setId(int id)
    {
        this.Id=id;
    }
    
    public String getNota()
    {
        return this.nota;
    }
    
    public void setId(String nota)
    {
        this.nota=nota;
    }
    
    public int getIdMateriaEstudiante(){
        return this.idMateriaStudiante;
    }
    public void setIdMateriaEstudiante(int idmateriaestu)
    {
        this.idMateriaStudiante=idmateriaestu;
    }
}
