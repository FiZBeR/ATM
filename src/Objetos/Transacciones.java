package Objetos;

import static Objetos.ATM.usuarios;
import static Objetos.DateTimeUtils.obtenerFechaHoraActual;

public class Transacciones extends Usuario{

    public Transacciones(String nombre, String cedula_id, String password, String correo, double saldo) {
        super(nombre, cedula_id, password, correo, saldo);
    }

    public static String retirar(String cedula_id, double nuevosaldo) {
        String resumen = null;
        if (usuarios.containsKey(cedula_id)) {
            Usuario usuario = usuarios.get(saldo);
            if (saldo > nuevosaldo) {
                saldo = saldo - nuevosaldo;
                String fechaHoraActual = obtenerFechaHoraActual();
                resumen = "Transaccion realizada \nResumen de la transaccion " + "\nCliente: "
                        + cedula_id + "\nDinero retirado " + nuevosaldo
                        + "\nNuevo saldo " + saldo + "Fecha: " + fechaHoraActual;
                RegistroMovimientos.registrar(cedula_id, nuevosaldo, fechaHoraActual);
            }
        } else {
            resumen = "Fondos insuficientes";
        }
        return resumen;
    }

    public static String retirar(String cedula_id, int nuevosaldo) {
        String resumen = "";
        if (usuarios.containsKey(cedula_id)) {
            Usuario usuario = usuarios.get(saldo);
            if (saldo > nuevosaldo) {
                saldo = saldo - nuevosaldo;
                String fechaHoraActual = obtenerFechaHoraActual();
                resumen = "Transaccion realizada \nResumen de la transaccion " + "\nCliente: "
                        + cedula_id + "\nDinero retirado " + nuevosaldo
                        + "\nNuevo saldo " + saldo + "Fecha: " + fechaHoraActual;
            } else {
                resumen = "Fondos insuficientes";
            }
        }
            return resumen;
    }
}
