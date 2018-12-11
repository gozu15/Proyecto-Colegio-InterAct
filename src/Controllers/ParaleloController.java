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
