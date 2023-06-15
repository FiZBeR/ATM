package Objetos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Objetos.Usuario;

import static Objetos.ATM.usuarios;
import static Objetos.Usuario.saldo;

public class RegistroMovimientos {
    public static Map<String, RegistroMovimientos> Registro;

    public RegistroMovimientos() {
        Registro = new HashMap<>();
    }

    public RegistroMovimientos(String cedula_id, double saldo, String fechaHoraActual) {


    }

    public static void registrar(String cedula_id, double saldo, String fechaHoraActual) {
        RegistroMovimientos registro = new RegistroMovimientos(cedula_id, saldo, fechaHoraActual);
        Registro.put(cedula_id, registro);
        System.out.println("transaccion registrada exitosamente.");
    }

    /*public static void guardarRegistroTransaccion(String cedula_id, String transaccion) {
    // Verificar si el usuario existe en el mapa de usuarios
    if (usuarios.containsKey(cedula_id)) {
        Usuario usuario = usuarios.get(cedula_id);
        usuario.agregarTransaccion(transaccion);
    } else {
        System.out.println("El usuario con cédula " + cedula_id + " no existe.");
    }
}
*/

    public static void mostrarMovimientosUsuario(String cedula_id) {
        // Verificar si el usuario existe en el mapa de usuarios
        if (usuarios.containsKey(cedula_id)) {
            Usuario usuario = usuarios.get(cedula_id);
            List<String> transacciones = usuario.getTransacciones();
            System.out.println("Movimientos del usuario con cédula " + cedula_id + ":");
            for (String transaccion : transacciones) {
                System.out.println(transaccion);
            }
        } else {
            System.out.println("El usuario con cédula " + cedula_id + " no existe.");
        }
    }


}
