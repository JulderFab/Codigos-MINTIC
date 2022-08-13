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
public class JDBCUtilities2 {
// Atributos de clase para gestión de conexión con la base de datos
private static final String UBICACION_BD = "ProyectosConstruccion.db";
public static Connection getConnection() throws SQLException {
String url = "jdbc:sqlite:" + UBICACION_BD;
return DriverManager.getConnection(url);
}
}
