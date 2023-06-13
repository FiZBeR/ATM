import Objetos.ATM;
import Objetos.Cuenta;
import Objetos.Transacciones;
import Objetos.RegistroMovimientos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        String cedula_id = "";
        String password = "";

        System.out.println("----------------------Bienvenido a tu BAnco Amigo -----------------------");
        System.out.println("--Por Favor ten presente tu numero de cedula y tu clave para cada opcion--");
        System.out.println("-------------------Eligue una de las siguientes opciones------------------");
        System.out.println("Opciones \n1. Ingresar \n2.Crear");

        int op = sc.nextInt();

        switch (op){
            case 1:

                System.out.println("Ingrese su número de cedula:");
                cedula_id = sc.nextLine();
                System.out.println("Ingrese su contraseña:");
                password = sc.nextLine();
                boolean acceso = Cuenta.autenticarUsuario(cedula_id, password);

                if (acceso){
                    System.out.println("Opciones: \n1.Retirar \n2.Registro de actividad \n3.Actualizar datos");
                    int ap = sc.nextInt();

                    switch (ap){
                        case 1:
                            System.out.println("Retirar");
                            System.out.println("Cuantos vas a retirar? ");
                            double saldo = sc.nextDouble();
                            String resu = Transacciones.retirar(cedula_id, saldo);
                            System.out.println(resu);
                        case 2:
                            String historia = RegistroMovimientos.mostrarregistro(cedula_id);
                            System.out.println("Sus ultimos movimientos son: " + historia);
                        case 3:
                            System.out.println("Bienvenido a la actualizacion de datos");
                            System.out.println("Ingresa tu cedula: ");
                            String cedula = sc.nextLine();
                            System.out.println("Ingrese su nombre:");
                            String nombre = sc.nextLine();
                            System.out.println("Ingrese su correo:");
                            String correo = sc.nextLine();
                            System.out.println("Ingrese su nuevo saldo:");
                            int nuevosaldo = sc.nextInt();
                            atm.actualizarDatosUsuario(cedula, nombre, correo, nuevosaldo);
                    }
                } else {
                    System.out.println("Usuario o Contaraseña incorrecta, intenta otra vez");
                }

            case 2:

                System.out.println("Formulario de creacion para nuevos usuarios");
                System.out.println("Ingrese su nombre:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su número de cedula:");
                cedula_id = sc.nextLine();
                System.out.println("Ingrese su contraseña:");
                password = sc.nextLine();
                System.out.println("Ingrese su correo:");
                String correo = sc.nextLine();
                System.out.println("Ingrese su saldo inicial:");
                double  saldo = sc.nextDouble();
                atm.registrarUsuario(nombre, cedula_id, password, correo, saldo);
                System.out.println("Usuario registrado con exito");
                break;
        }
    }
}