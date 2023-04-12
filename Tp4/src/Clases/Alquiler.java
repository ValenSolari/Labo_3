package Clases;

import java.util.UUID;
import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class Alquiler {

    private String Id;
    private String pelicula;
    private String nombre;
    private LocalDate salida;
    private LocalDate reingreso;

    public Alquiler() {
    }

    public Alquiler( String pelicula, String nombre, LocalDate salida, LocalDate reingreso) {
        Id = UUID.randomUUID().toString();
        this.pelicula = pelicula;
        this.nombre = nombre;
        this.salida = salida;
        this.reingreso = reingreso;
    }

    ///region set and get
    public String getId() {
        return Id;
    }


    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public LocalDate getReingreso() {
        return reingreso;
    }

    public void setReingreso(LocalDate reingreso) {
        this.reingreso = reingreso;
    }
    ///endregion


    @Override
    public String toString() {
        return "Alquiler{" +
                "Id='" + Id + '\'' +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", salida=" + salida +
                ", reingreso=" + reingreso +
                '}';
    }
}
