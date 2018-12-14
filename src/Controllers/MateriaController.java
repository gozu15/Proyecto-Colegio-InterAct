/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import DataBaseManager.MateriaDataBase;
import Models.Materia;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class MateriaController {
  MateriaDataBase DbMateria=new MateriaDataBase();
    public int Create(Materia materia){
        
        int response =DbMateria.Insert(materia);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Materia> Select(){
        return DbMateria.SelectMaterias();
    }   
    
     public List<Materia> Select(String terimo){
        return DbMateria.BuscarMaterias(terimo);
    }  
     
    public Materia Select(int id){
        return DbMateria.SelectMateria(id);
    }
     public int Update(Materia materia){
        
        int response =DbMateria.Update(materia);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbMateria.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
}
