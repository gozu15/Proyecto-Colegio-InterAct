/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DataBaseManager.ColegioDataBase;
import Models.Colegio;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ColegioController {
/**
 *
 * @author Wilver Hidalgo Barja
 */
    ColegioDataBase DbColegio=new ColegioDataBase();
    public int Create(Colegio colegio){
        
        int response=1;
        if(DbColegio.Insert(colegio)==1){
            
        }else{
            response=0;
        }
        return response;
    }
    public Colegio Select(){
        return DbColegio.Select();
    }
}
