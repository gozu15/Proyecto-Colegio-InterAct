/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Gestion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

/**
 *
 * @author acher
 */
public class GestionDataBase {
    public int Insert(Gestion gestion) throws ParseException{
            int res=0;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date parsed = format.parse(gestion.getYearRegistro());
        java.sql.Date sql = new java.sql.Date(parsed.getTime());
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO gestion VALUES (?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setDate(2, sql); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
     st.setString(3,gestion.getGestion());    
      
     
     
//el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    public List<Gestion> Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        List<Gestion> gestionlist=new ArrayList<>();
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from gestion";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                   gestionlist.add(new Gestion(rs.getInt("idGESTION"),rs.getString("number_year"),rs.getString("gestion")));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return gestionlist;
    }
    
    public int Delete(Gestion evaluacionprof){
    int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     
     //DELETE FROM `curso_materia` WHERE 0
     st = c.prepareStatement("DELETE FROM gestion WHERE idGESTION =" +evaluacionprof.getId());
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
    }
    
    
     public int Update(Gestion gestion){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     //UPDATE `curso_materia` SET `idCURSO_MATERIA`=[value-1],`MATERIA_idMATERIA`=[value-2],`CURSO_idCURSO`=[value-3] WHERE 1
    //UPDATE `tiempo_evaluacion` SET `idTIEMPO_EVALUACION`=7,`tiempo_evaluacion`="PRIMER SEMESTRE" WHERE `idTIEMPO_EVALUACION`=7
     st = c.prepareStatement("UPDATE gestion SET idGESTION="+gestion.getId()+",number_year= '"+gestion.getYearRegistro()+"',gestion='"+gestion.getGestion()+"' WHERE idGESTION="+gestion.getId());
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
