package Modelo;

import java.util.Date;
import oracle.sql.*;

/**
 *
 * @author Axel
 */
public class Clientes {

    private int cedula;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Date fecha;
    private String telefono;
    private String email;

    public Clientes() {
    }

    public Clientes(int cedula, String nombre, String apellido1, String apellido2, Date fecha, String telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha = fecha;
        this.telefono = telefono;
        this.email = email;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
