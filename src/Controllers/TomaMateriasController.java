/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.TomaMateriasDataBase;
import Models.TomaMaterias;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class TomaMateriasController {
      TomaMateriasDataBase DbTomaMateria=new TomaMateriasDataBase();
      
    public int EstudianteToma(TomaMaterias tomaMaterias,int [] idMateria){
        //TomaMateriaEstudiante
        int response =DbTomaMateria.TomaEstudiante(tomaMaterias);
        if(response!=0){
             for(int i=0;i<idMateria.length;i++){
              //    System.out.println(idMateria[i]);  
                  int response2 =DbTomaMateria.TomaMateriaEstudiante(response,idMateria[i]);
                  
                 if(response2!=0){
                    }else{
                        response2=0;
                    }
                 
             }
            
        }else{
            response=0;
        }
        return response;
    }
    
      public int ProfesorToma(TomaMaterias tomaMaterias){
        
        int response =DbTomaMateria.TomaProfesor(tomaMaterias);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }

    
     public TomaMaterias SelectEstudiante(int id){
        return DbTomaMateria.SelectTomaEstudiante(id);
    }  
     
    public TomaMaterias SelectProfesor(int id){
        return DbTomaMateria.SelectTomaProfesor(id);
    }
     public int UpdateEstudiante(TomaMaterias tomaMaterias){
        
        int response =DbTomaMateria.UpdateTomaEstudiante(tomaMaterias);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
     
         public int UpdateProfesor(TomaMaterias tomaMaterias){
        
        int response =DbTomaMateria.UpdateTomaProfesor(tomaMaterias);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int DeleteEstudiante(int id){
        
        int response =DbTomaMateria.DeleteEstudiante(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
        public int DeleteProfesor(int id){
        
        int response =DbTomaMateria.DeleteProfesor(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
    
}
