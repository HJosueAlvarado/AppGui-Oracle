/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * author XPC
 */
public class ConexionOracle {
    
    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "HJOSUE", "12345");
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: Oracle JDBC Driver no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: Oracle JDBC Driver no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("No se pudo conectar a la BD");
            e.printStackTrace();
        }
        return con;
    }
}

