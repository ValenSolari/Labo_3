package Models;

import java.time.LocalDate;

public class Album {
    private String titulo;
    private LocalDate lanzamiento;
    private Artista artista;

    ///region Constructores

    public Album(String titulo, LocalDate lanzamiento, Artista artista) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.artista = artista;
    }

    public Album() {
    }
    ///endregion

    ///region Get and Set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", lanzamiento=" + lanzamiento +
                ", artista=" + artista +
                '}';
    }


    ///endregion
}
