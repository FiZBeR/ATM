package Objetos;
import java.util.HashMap;
import java.util.Map;
import Objetos.Usuario;

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
        System.out.println("Usuario registrado exitosamente.");
    }

    public static String mostrarregistro(String cedula_id){
        String historia = "";
        if (Registro.containsKey(cedula_id)) {
            RegistroMovimientos registro = Registro.get(cedula_id);

        } else {

        }
        return historia;
    }

}
