package Models;

import java.util.Calendar;

public class Peliculas {

    private String nombre;
    private Integer minutosDuracion;
    private Calendar fechaLanzamiento;
    private String clasificaion;
    private String pais;
    private String descripcion;
    private Integer stock;

    @Override
    public String toString() {
        return "Peliculas{" +
                "nombre='" + nombre + '\'' +
                ", minutosDuracion=" + minutosDuracion +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", clasificaion='" + clasificaion + '\'' +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                '}';
    }
}






