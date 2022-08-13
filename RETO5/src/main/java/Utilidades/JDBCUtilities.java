/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Fabian
 */
public class JDBCUtilities {
    
    public static Connection conexion () {
    Connection conn = null;
    
    try {
        String url = "jdbc: sqlite : ProyectosConstruccion.db";
        conn = DriverManager.getConnection(url);
            
    } catch (SQLException e) {
    
        System.out.println(e);}
    
        return conn;
                }
        
    }
