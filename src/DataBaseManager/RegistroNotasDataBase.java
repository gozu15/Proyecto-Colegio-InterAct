/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Registro_Notas;
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
public class RegistroNotasDataBase {
    
    
     public int Insert(Registro_Notas cursomate){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO registro_notas VALUES (?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setString(2,cursomate.getNota());
     st.setInt(3,cursomate.getIdMateriaEstudiante());
//el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
      //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    public List<Registro_Notas> Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        List<Registro_Notas> regnotas=new ArrayList<>();
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from registro_notas";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    regnotas.add(new Registro_Notas(rs.getInt("idREGISTRO_NOTAS"),rs.getString("notas"),rs.getInt("MATERIA_ESTUDIANTE_idMATERIA_ESTUDIANTE")));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return regnotas;
    }
    
    public int Delete(Registro_Notas regnotas){
    int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     
     //DELETE FROM `curso_materia` WHERE 0
     st = c.prepareStatement("DELETE FROM registro_notas WHERE idREGISTRO_NOTAS =" +regnotas.getid());
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
    }
    
    
     public int Update(Registro_Notas regnotas){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     //UPDATE `curso_materia` SET `idCURSO_MATERIA`=[value-1],`MATERIA_idMATERIA`=[value-2],`CURSO_idCURSO`=[value-3] WHERE 1
    //UPDATE `tiempo_evaluacion` SET `idTIEMPO_EVALUACION`=7,`tiempo_evaluacion`="PRIMER SEMESTRE" WHERE `idTIEMPO_EVALUACION`=7
     st = c.prepareStatement("UPDATE registro_notas SET idREGISTRO_NOTAS="+regnotas.getid()+",notas= '"+regnotas.getNota()+"',MATERIA_ESTUDIANTE_idMATERIA_ESTUDIANTE="+regnotas.getIdMateriaEstudiante()+" WHERE idREGISTRO_NOTAS="+regnotas.getid());
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
