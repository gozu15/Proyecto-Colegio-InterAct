/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Curso_Materia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author acher
 */
public class CursoMateria_DataBase {
    
    public int Insert(Curso_Materia cursomate){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO curso_materia VALUES (?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setInt(2,cursomate.getIdCurso() ); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
     st.setInt(3, cursomate.getIdMateria());  //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    public List<Curso_Materia> Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        List<Curso_Materia> cursoMateria=new ArrayList<>();
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from curso_materia";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    cursoMateria.add(new Curso_Materia(rs.getInt("idCURSO_MATERIA"),rs.getInt("MATERIA_idMATERIA"),rs.getInt("CURSO_idCURSO")));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return cursoMateria;
    }
    
    public int Delete(int id){
    int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     
     //DELETE FROM `curso_materia` WHERE 0
     st = c.prepareStatement("DELETE FROM curso_materia WHERE idCURSO_MATERIA =" +id);
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
    }
    
    
     public int Update(Curso_Materia cursomate){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     //UPDATE `curso_materia` SET `idCURSO_MATERIA`=[value-1],`MATERIA_idMATERIA`=[value-2],`CURSO_idCURSO`=[value-3] WHERE 1
     st = c.prepareStatement("UPDATE curso_materia SET idCURSO_MATERIA="+cursomate.getId()+",MATERIA_idMATERIA="+cursomate.getIdMateria()+",CURSO_idCURSO="+cursomate.getIdCurso()+" WHERE idCURSO_MATERIA="+cursomate.getId());
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    
}
