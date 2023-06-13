package Objetos;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    public static Map<String, Usuario> usuarios;

    public ATM() {
        usuarios = new HashMap<>();
    }

    public void registrarUsuario(String nombre, String cedula_id, String password, String correo, double saldo) {
        Usuario usuario = new Usuario(nombre, cedula_id, password, correo, saldo);
        usuarios.put(cedula_id, usuario);
        System.out.println("Usuario registrado exitosamente.");
    }

    public void actualizarDatosUsuario(String cedula_id, String nuevonombre, String correo, double saldo) {
        if (usuarios.containsKey(cedula_id)) {
            Usuario usuario = usuarios.get(cedula_id);
            usuario.setCorreo(correo);
            usuario.setNombre(nuevonombre);
            usuario.setSaldo(saldo);
            System.out.println("Datos del usuario " + cedula_id + " actualizados correctamente.");
        } else {
            System.out.println("El usuario " + cedula_id + " no existe.");
        }
    }

}