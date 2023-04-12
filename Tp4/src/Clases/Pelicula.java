package Clases;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private LocalDate fechaLanzamiento;
    private String genero;

    private Integer stock;
    private Integer duracion;
    private String calificacion;
    private String paisOrigen;

    public Pelicula() {
    }

    public Pelicula(String titulo, LocalDate fechaLanzamiento, String genero, Integer stock, Integer duracion, String calificacion, String paisOrigen) {
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.stock = stock;
        this.duracion = duracion;
        this.calificacion = calificacion;
        this.paisOrigen = paisOrigen;
    }

    ///region Get and Set

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    ///endregion


    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", genero='" + genero + '\'' +
                ", stock=" + stock +
                ", duracion=" + duracion +
                ", calificacion='" + calificacion + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}


