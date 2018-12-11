/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioproyect;

import Controllers.ColegioController;
import Controllers.ParaleloController;
import Models.Colegio;
import Models.Paralelo;
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ColegioProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // ColegioController colegio= new ColegioController();
        ParaleloController paralelo= new ParaleloController();
//        Colegio NewColegio;
//        NewColegio=new Colegio(0,"Camilo",5);
//        if(colegio.Create(NewColegio)==1){
//            System.out.println("*** Celegio Creado Con exito ***");
//        }
//        else{
//         System.out.println("*** Error ***");   
//        }
//        // TODO code application logic here

 //Colegio Lista= colegio.Select();
     
 //System.out.println(Lista.getNombre());
 
 //
 ///
 
     Paralelo NewParalelo;
       NewParalelo=new Paralelo(0,"Paralelo F",2);
        if(paralelo.Create(NewParalelo)==1){
            System.out.println("*** Paralelo Creado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
        // TODO code application logic here
        
        List<Paralelo> paralelos=paralelo.Select();
         paralelos.forEach((item) -> {
            System.out.println(item.getNombre());
        });
    }
    
}
