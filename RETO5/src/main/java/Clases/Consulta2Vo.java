    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Modelo.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Fabian
 */
public class Consulta2Vo {
    
    public static ArrayList <String []> valores () {
    ResultSet rs = null;
    ArrayList <String []> salida_vo= new ArrayList<String[]> ();
    try { 
    rs = Consulta2Dao.consulta();
    while  (rs.next()) {
    // ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad  
    int ID= rs.getInt("ID_Proyecto");
    String constructora = rs.getString("Constructora");
    String numeroHabitaciones =rs.getString("Numero_Habitaciones");
    String ciudad =rs.getString("Ciudad");
    
        //System.out.println(String.format("%5d %15s %15s %15s", ID, nombre, apellido, ciudad));
        salida_vo.add (new String [] {ID+ "", constructora, numeroHabitaciones, ciudad});
    }
    
    
    }
    
    catch (Exception e) {
    
        System.out.println(e);}
    
        return salida_vo; 
    }
    
}
