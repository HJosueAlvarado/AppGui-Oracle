/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_vudu;

import BD.ConexionOracle;
import java.sql.Connection;

/**
 *
 * @author XPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Intentar establecer la conexión
        Connection con = ConexionOracle.conectar();
    }
    
}
