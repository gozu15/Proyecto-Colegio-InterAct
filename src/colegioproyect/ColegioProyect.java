/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegioproyect;

import Controllers.ColegioController;
import Controllers.MateriaController;
import Controllers.ParaleloController;
import Controllers.TiempoEvaluacionController;
import Controllers.RegistroNotasController;
import Controllers.EvaluacionProfesorController;
import Controllers.GestionController;
//<<<<<<< HEAD
import Controllers.CursoMateriaController;
//=======
import Controllers.UsuarioController;
//>>>>>>> 76205318247582f2b65f391e9206649ff7d18372
import Models.Colegio;
import Models.Materia;
import Models.Paralelo;
import Models.Tiempo_Evaluacion;
import Models.Registro_Notas;
import Models.Evaluacion_Profesor;
import Models.Gestion;
//<<<<<<< HEAD
import Models.Curso_Materia;
//=======
import Models.Usuario;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//>>>>>>> 76205318247582f2b65f391e9206649ff7d18372
import java.util.List;

/**
 *
 * @author Wilver Hidalgo Barja
 */
public class ColegioProyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       // ColegioController colegio= new ColegioController();
        ParaleloController paralelo= new ParaleloController();
        CursoMateriaController curmate = new CursoMateriaController();
        TiempoEvaluacionController tiempoeva= new TiempoEvaluacionController();
        RegistroNotasController registrosNotas = new RegistroNotasController();
        EvaluacionProfesorController evaluacionProfesor = new EvaluacionProfesorController();
        GestionController gestion = new GestionController();
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
 
//<<<<<<< HEAD
     Paralelo NewParalelo;
     Curso_Materia nuevoCurso;
     Tiempo_Evaluacion nuevotiempoeva;
     Registro_Notas nuevanota;
     Evaluacion_Profesor evaprofe;
     Gestion nuevagestion;
     //nuevanota = new Registro_Notas(5,"70",3);
     nuevagestion = new Gestion(5,"20181220","2");
    // evaprofe = new Evaluacion_Profesor(3,"SEGUNDA EVALUACION",2,5);
     
     if(gestion.Delete(nuevagestion)==1){
            System.out.println("*** Paralelo actualizado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
      
       List<Gestion> reggestion= gestion.Select();
         reggestion.forEach((item) -> {
            System.out.println(item.getYearRegistro());
        });
     
     //nuevotiempoeva = new Tiempo_Evaluacion(7,"Primer Semestre");
      /*if(evaluacionProfesor.Delete(evaprofe)==1){
            System.out.println("*** Paralelo actualizado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
      
       List<Evaluacion_Profesor> regevaprof=evaluacionProfesor.Select();
         regevaprof.forEach((item) -> {
            System.out.println(item.getDescripcion());
        });*/
     
     //nuevoCurso= new Curso_Materia(6,4,1);
     /*nuevotiempoeva = new Tiempo_Evaluacion(7,"Primer Semestre");
     
      if(tiempoeva.Delete(nuevotiempoeva)==1){
            System.out.println("*** Paralelo actualizado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
      
       List<Tiempo_Evaluacion> tiempolist=tiempoeva.Select();
         tiempolist.forEach((item) -> {
            System.out.println(item.getTiempo());
        });*/
     
     /*if(curmate.Delete(nuevoCurso)==1)
     {
         System.out.println("*** borrado ***");
     }
     else
     {
     System.out.println("*** Error ***"); 
     }*/
       /*NewParalelo=new Paralelo(0,"Paralelo z",2);
        if(paralelo.Create(NewParalelo)==1){
            System.out.println("*** Paralelo Creado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
        // TODO code application logic here
        if(curmate.Create(nuevoCurso)==1){
            System.out.println("*** Paralelo Creado Con exito ***");
        }
        else{
         System.out.println("*** Error ***");   
        }
        List<Paralelo> paralelos=paralelo.Select();
         paralelos.forEach((item) -> {
            System.out.println(item.getNombre());
        });
         
         List<Curso_Materia> cursomateria=curmate.Select();
         paralelos.forEach((item) -> {
            System.out.println(item.getNombre());
        });*/
//=======
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
        
////>>>>>>> 76205318247582f2b65f391e9206649ff7d18372
    }
    
}
