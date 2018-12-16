/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseManager;

import Models.Evaluacion_Profesor;
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
public class EvaluacionProfesorDataBase {
     public int Insert(Evaluacion_Profesor evaProfe){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     st = c.prepareStatement("INSERT INTO evaluacion_profesor VALUES (?,?,?,?)");
     st.setObject(1, null);  //el 1 indica que se sustituira el primer '?' con el valor en int de 1234
     st.setString(2,evaProfe.getDescripcion()); //el 2 indica que se sustituira el segundo '?' por el valor en double de 123.45 
     st.setInt(3,evaProfe.getIdMateriaProfesor());
     st.setInt(4,evaProfe.getIdTiempoEvaluacion());
     
//el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
        
    }
    
    public List<Evaluacion_Profesor> Select(){
       
	PreparedStatement ps=null;
	ResultSet rs=null;
        List<Evaluacion_Profesor> tiempoeva=new ArrayList<>();
	try {
            Connection c = dbConexion.getConnection();
		String query="select * from evaluacion_profesor";
		ps=c.prepareStatement(query);
		//ps.setString(1, sl_no);
		System.out.println(ps);
		rs=ps.executeQuery();
		while(rs.next()){
                    tiempoeva.add(new Evaluacion_Profesor(rs.getInt("idEVALUACION_PROFESOR"),rs.getString("descripcion"),rs.getInt("MATERIA_PROFESOR_idMATERIA_PROFESOR"),rs.getInt("TIEMPO_EVALUACION_idTIEMPO_EVALUACION")));
		
		}
	} catch (Exception e) {
		System.out.println(e);
	}
        return tiempoeva;
    }
    
    public int Delete(Evaluacion_Profesor evaluacionprof){
    int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     
     //DELETE FROM `curso_materia` WHERE 0
     st = c.prepareStatement("DELETE FROM evaluacion_profesor WHERE idEVALUACION_PROFESOR =" +evaluacionprof.getId());
     //el 3 indica que se sustiruira el tercer '?' por la cadena "hola"
    //los tipos de variables deben coincidir con los tipos definidos en las columnas de la tabla en la que se insertaran
    res=st.executeUpdate();
 } 
 catch (SQLException ex) {
   //captura la excepcion
 }
        return res;
    }
    
    
     public int Update(Evaluacion_Profesor evaluacionprof){
            int res=0;
        try {
     Connection c = dbConexion.getConnection();
     PreparedStatement st;
     //UPDATE `curso_materia` SET `idCURSO_MATERIA`=[value-1],`MATERIA_idMATERIA`=[value-2],`CURSO_idCURSO`=[value-3] WHERE 1
    //UPDATE `tiempo_evaluacion` SET `idTIEMPO_EVALUACION`=7,`tiempo_evaluacion`="PRIMER SEMESTRE" WHERE `idTIEMPO_EVALUACION`=7
     st = c.prepareStatement("UPDATE evaluacion_profesor SET idEVALUACION_PROFESOR="+evaluacionprof.getId()+",descripcion= '"+evaluacionprof.getDescripcion()+"',MATERIA_PROFESOR_idMATERIA_PROFESOR="+evaluacionprof.getIdMateriaProfesor()+",TIEMPO_EVALUACION_idTIEMPO_EVALUACION="+evaluacionprof.getIdTiempoEvaluacion()+" WHERE idEVALUACION_PROFESOR="+evaluacionprof.getId());
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
