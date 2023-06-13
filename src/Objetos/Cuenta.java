package Objetos;
import Objetos.ATM;

public class Cuenta extends ATM{

    public static boolean autenticarUsuario(String cedula_id, String password) {
        if (usuarios.containsKey(cedula_id)) {
            Usuario usuario = usuarios.get(cedula_id);
            if (usuario.getPassword() == password) {
                System.out.println("Autenticación exitosa. Bienvenido, " + cedula_id + "!");
                return true;
            }
        }
        System.out.println("Autenticación fallida. Por favor, verifique su número de cuenta y PIN.");
        return false;
    }
}
