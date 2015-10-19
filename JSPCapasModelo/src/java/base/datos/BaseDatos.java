/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Moises
 */
public class BaseDatos {

    static Connection conexion;
    
    public static void conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/proyecto", "root", "");
        } catch (Exception e) {
            throw new Exception("Imposible realizar conexion con la BD"+e.getMessage());            
        }
    }
    
    public static ResultSet consultar(String sql) throws Exception{
        try{
            Statement st = conexion.createStatement();
            ResultSet resultado = st.executeQuery(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al consultar la BD"+e.getMessage());            
        }
    }
    
    public static int ejecutar(String sql) throws Exception{
        try{
            Statement st = conexion.createStatement();
            int resultado = st.executeUpdate(sql);
            return resultado;
        }
        catch (Exception e) {
            throw new Exception("Error al actualizar la BD"+e.getMessage());            
        }
    }
    
    public static void desconectar() throws Exception{
        try{
            conexion.close();
        }
        catch(Exception e){
            throw new Exception("Error al desconectar con la BD"+e.getMessage());
        }
    }
}
