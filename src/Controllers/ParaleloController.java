<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.ParaleloDataBase;
import Models.Paralelo;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ParaleloController {
   ParaleloDataBase DbParalelo=new ParaleloDataBase();
    public int Create(Paralelo paralelo){
        
        int response=1;
        if(DbParalelo.Insert(paralelo)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Paralelo> Select(){
        return DbParalelo.Select();
    }   
    public int Update(Paralelo paralelo){
        
        int response =DbParalelo.Update(paralelo);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
      public int Delete(int id){
        
        int response =DbParalelo.Delete(id);
        if(response!=0){
            
        }else{
            response=0;
        }
        return response;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.ParaleloDataBase;
import Models.Paralelo;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ParaleloController {
   ParaleloDataBase DbParalelo=new ParaleloDataBase();
    public int Create(Paralelo paralelo){
        
        int response=1;
        if(DbParalelo.Insert(paralelo)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public List<Paralelo> Select(){
        return DbParalelo.Select();
    }   
    
}
>>>>>>> 889cc8ae75088e16bef307684967fe0f6980d24e
