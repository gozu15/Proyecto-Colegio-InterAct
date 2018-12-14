/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.CursoMateria_DataBase;
import Models.Curso_Materia;
import java.util.List;

/**
 *
 * @author acher
 */
public class CursoMateriaController {
    CursoMateria_DataBase dbcursomateria=new CursoMateria_DataBase();
    public int Create(Curso_Materia curmate){
        
        int response=1;
        if(dbcursomateria.Insert(curmate)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Curso_Materia> Select(){
        return dbcursomateria.Select();
    }  
    
    public int Delete (Curso_Materia curmate)
    {
        int response=1;
         if(dbcursomateria.Delete(curmate.getId())==1){
            
        }else{
            response=0;
        }
        return response;
    }
    
    public int Update(Curso_Materia cursomate){
    int response=1;
         if(dbcursomateria.Update(cursomate)==1){
            
        }else{
            response=0;
        }
        return response;
    }
}
