/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.TiempoEvaluacionDataBase;
import Models.Tiempo_Evaluacion;
import java.util.List;

/**
 *
 * @author acher
 */
public class TiempoEvaluacionController {
    TiempoEvaluacionDataBase dbtiempoeva=new TiempoEvaluacionDataBase();
    public int Create(Tiempo_Evaluacion tiempoev){
        
        int response=1;
        if(dbtiempoeva.Insert(tiempoev)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Tiempo_Evaluacion> Select(){
        return dbtiempoeva.Select();
    }  
    
    public int Delete (Tiempo_Evaluacion tiempoev)
    {
        int response=1;
         if(dbtiempoeva.Delete(tiempoev)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    
    public int Update(Tiempo_Evaluacion tiempoev){
    int response=1;
         if(dbtiempoeva.Update(tiempoev)==1){
            
        }else{
            response=0;
        }
        return response;
    }
}
