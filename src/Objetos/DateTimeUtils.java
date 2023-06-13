package Objetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
    public static String obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual
        Date fechaHoraActual = new Date();

        // Definir el formato de fecha y hora deseado
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Formatear la fecha y hora actual
        String fechaHoraFormateada = formato.format(fechaHoraActual);

        return fechaHoraFormateada;
    }
}
