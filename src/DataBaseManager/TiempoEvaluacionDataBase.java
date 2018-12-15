/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Tiempo_Evaluacion;
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
public class TiempoEvaluacionDataBase {
    public int Insert(Tiempo_Evaluacion cursomate){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO tiempo_evaluacion VALUES (?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setString(2,cursomate.getTiempo()); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
      //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    public List<Tiempo_Evaluacion> Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        List<Tiempo_Evaluacion> tiempoeva=new ArrayList<>();
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from tiempo_evaluacion";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    tiempoeva.add(new Tiempo_Evaluacion(rs.getInt("idTIEMPO_EVALUACION"),rs.getString("tiempo_evaluacion")));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return tiempoeva;
    }
    
    public int Delete(Tiempo_Evaluacion tiempeva){
    int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     
     //DELETE FROM `curso_materia` WHERE 0
     st = c.prepareStatement("DELETE FROM tiempo_evaluacion WHERE idTIEMPO_EVALUACION =" +tiempeva.getId());
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
    }
    
    
     public int Update(Tiempo_Evaluacion timeeva){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     //UPDATE `curso_materia` SET `idCURSO_MATERIA`=[value-1],`MATERIA_idMATERIA`=[value-2],`CURSO_idCURSO`=[value-3] WHERE 1
    //UPDATE `tiempo_evaluacion` SET `idTIEMPO_EVALUACION`=7,`tiempo_evaluacion`="PRIMER SEMESTRE" WHERE `idTIEMPO_EVALUACION`=7
     st = c.prepareStatement("UPDATE tiempo_evaluacion SET idTIEMPO_EVALUACION="+timeeva.getId()+",tiempo_evaluacion= '"+timeeva.getTiempo()+"' WHERE idTIEMPO_EVALUACION="+timeeva.getId());
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
