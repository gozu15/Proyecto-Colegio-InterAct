/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioproyect;

import Controllers.ColegioController;
import Controllers.MateriaController;
import Controllers.ParaleloController;
import Controllers.RegistroController;
import Controllers.TomaMateriasController;
import Controllers.UsuarioController;
import Models.Colegio;
import Models.Materia;
import Models.Paralelo;
import Models.Registro;
import Models.TomaMaterias;
import Models.Usuario;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
 
//     Paralelo NewParalelo;
//       NewParalelo=new Paralelo(0,"Paralelo z",2);
//        if(paralelo.Create(NewParalelo)==1){
//            System.out.println("*** Paralelo Creado Con exito ***");
//        }
//        else{
//         System.out.println("*** Error ***");   
//        }
//        // TODO code application logic here
//        
//        List<Paralelo> paralelos=paralelo.Select();
//         paralelos.forEach((item) -> {
//            System.out.println(item.getNombre());
//        });
//
//    MateriaController materia= new MateriaController();
////        Materia newMateria;
////         newMateria =new Materia(8,"Gramatica 5","Dibujo tecnico y manualidades","10 CREDITOD");
////         
////                int id=materia.Update(newMateria);
////                 if(id!=0){
////            System.out.println("*** Paralelo Creado Con exito ***  "+id);
////        }
////        else{
////         System.out.println("*** Error ***");   
////        }
////        
//
//   //        System.out.println(materia.Delete(8)); 
//
//             
//        
//        List<Materia> materias=materia.Select("grama");
//         materias.forEach((item) -> {
//            System.out.println(item.getNombre());
//        });
//         
//       //  System.out.println(materia.Select(2).getNombre());
           



    UsuarioController usuario= new UsuarioController();
//        Usuario newUsuario;
//        java.util.Date d = new java.util.Date(); 
//java.sql.Date date2 = new java.sql.Date(d.getTime());
//        
//         newUsuario =new Usuario(5,"Moises8","Armando xelio","Masulino",date2,"Estudiante");
//         
//                int id=usuario.Update(newUsuario);
//                 if(id!=0){
//            System.out.println("*** Paralelo Creado Con exito ***  "+id);
//        }
//        else{
//         System.out.println("*** Error ***");   
//        }
//        

    //       System.out.println(usuario.Delete(6)); 

             
        
//        List<Usuario> usuarios=usuario.Select("lo");
//         usuarios.forEach((item) -> {
//            System.out.println(item.getNombre());
//        });
//         
//         System.out.println(usuario.Select(2).getNombre());


//Registro



    RegistroController registro= new RegistroController();
//        Registro newRegistro;
//        java.util.Date d = new java.util.Date(); 
//java.sql.Date date2 = new java.sql.Date(d.getTime());
//        
//         newRegistro =new Registro(5,date2,"Secundaria","Tarde","Ninguno",5);
//         
//                int id=registro.Update(newRegistro);
//                 if(id!=0){
//            System.out.println("*** Paralelo Creado Con exito ***  "+id);
//        }
//        else{
//         System.out.println("*** Error ***");   
//        }
//        

//           System.out.println(registro.Delete(6)); 
//
//             
//        
//        List<Registro> registro3=registro.BuscarPorIdUsuario(5);
//         registro3.forEach((item) -> {
//            System.out.println(item.getCategoriaEstudio());
//        });
//         
//         System.out.println(registro.Select(2).getCategoriaEstudio());

TomaMateriasController tomas= new TomaMateriasController();

 TomaMaterias newtoma;
        java.util.Date d = new java.util.Date(); 
java.sql.Date date2 = new java.sql.Date(d.getTime());
        
        newtoma =new TomaMaterias(0,date2,3,1);
        int [] Materias={1,2,3,4,5};
         
                int id=tomas.EstudianteToma(newtoma,Materias);
                 if(id!=0){
            System.out.println("*** Tomas con exito ***  "+id);
        }
        else{
         System.out.println("*** Error ***");   
        }

        
    }
    
}
