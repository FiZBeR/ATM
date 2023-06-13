package Objetos;

import java.util.HashMap;
import java.util.Map;

public class Usuario {

    private String nombre;
    private String cedula_id;
    private String password;
    private String correo;
    public static double saldo = 0.0;



    public Usuario(String nombre, String cedula_id, String password, String correo) {
        this.nombre = nombre;
        this.cedula_id = cedula_id;
        this.password = password;
        this.correo = correo;
    }
    public Usuario(String nombre, String cedula_id, String password, String correo, double saldo) {
        this(nombre, cedula_id, password, correo);
        this.saldo = saldo;
    }

    public Usuario(String cedula_id, String password) {

    }

    public Usuario() {

    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula_id() {
        return cedula_id;
    }

    public String getPassword() {
        return password;
    }

    public String getCorreo() {
        return correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
