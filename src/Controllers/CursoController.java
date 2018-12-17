/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.CursoDataBase;
import Models.Curso;
import java.util.List;

/**
 *
 * @author Elvis Quiroz
 */
public class CursoController {
    CursoDataBase DbCurso=new CursoDataBase();
    public int Create(Curso curso){
        
        int response=1;
        if(DbCurso.Insert(curso)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Curso> Select(){
        return DbCurso.SelectCurso();
    }   
    
     public List<Curso> Select(String terimo){
        return DbCurso.BuscarCurso(terimo);
    }  
    public Curso Select(int Id){
        return DbCurso.Select();
    }
    public int Update(Curso curso){
        
        int response =DbCurso.Update(curso);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbCurso.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
}
