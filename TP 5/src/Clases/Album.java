package Clases;

import java.time.LocalDate;

public class Album  {
    private Integer añoLamzamiento;
    private String titulo;
    private Artista x;

    ///region Constructores
    public Album() {
    }

    public Album(Integer añoLamzamiento, String titulo, Artista x) {
        this.añoLamzamiento = añoLamzamiento;
        this.titulo = titulo;
        this.x = x;
    }
    ///endregion

    ///region Get and Set

    public Integer getAñoLamzamiento() {
        return añoLamzamiento;
    }

    public void setAñoLamzamiento(Integer añoLamzamiento) {
        this.añoLamzamiento = añoLamzamiento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getX() {
        return x;
    }

    public void setX(Artista x) {
        this.x = x;
    }
    ///endregion


    @Override
    public String toString() {
        return "Album{" +
                "añoLamzamiento=" + añoLamzamiento +
                ", titulo='" + titulo + '\'' +
                ", x=" + x +
                '}';
    }
}
