/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.EvaluacionProfesorDataBase;
import Models.Evaluacion_Profesor;
import java.util.List;

/**
 *
 * @author acher
 */
public class EvaluacionProfesorController {
    EvaluacionProfesorDataBase dbevaprofe=new EvaluacionProfesorDataBase();
    public int Create(Evaluacion_Profesor evaluacionProfe){
        
        int response=1;
        if(dbevaprofe.Insert(evaluacionProfe)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Evaluacion_Profesor> Select(){
        return dbevaprofe.Select();
    }  
    
    public int Delete (Evaluacion_Profesor evaluacionProfe)
    {
        int response=1;
         if(dbevaprofe.Delete(evaluacionProfe)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    
    public int Update(Evaluacion_Profesor evaluacionProfe){
    int response=1;
         if(dbevaprofe.Update(evaluacionProfe)==1){
            
        }else{
            response=0;
        }
        return response;
    }
}
