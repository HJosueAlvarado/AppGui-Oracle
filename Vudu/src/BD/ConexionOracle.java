package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionOracle {

    private static final String URL = "jdbc:oracle:thin:@localhost:1522:orcl";
    private static final String USUARIO = "Axel";
    private static final String CONTRASENA = "123";

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            if (con != null) {
                System.out.println("Conexión exitosa");
            }
        } catch (ClassNotFoundException e) {
            mostrarError("Error: Oracle JDBC Driver no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            mostrarError("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        System.err.println(mensaje);
    }
}


