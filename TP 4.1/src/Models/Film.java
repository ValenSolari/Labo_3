package Models;

import java.time.LocalDate;

public class Film {

    private String titulo;
    private Egeneros genero;
    private Integer stock;
    private LocalDate lanzamiento;
    private String duracionMinutos;
    private Eaudiencia audiencia;
    private int vecesAlquiladas;


    ///region Constructor


    public Film(String titulo, Egeneros genero, Integer stock, LocalDate lanzamiento, String duracionMinutos, Eaudiencia audiencia) {
        this.titulo = titulo;
        this.genero = genero;
        this.stock = stock;
        this.lanzamiento = lanzamiento;
        this.duracionMinutos = duracionMinutos;
        this.audiencia = audiencia;
        this.vecesAlquiladas = 0;
    }

    public Film() {
        this.vecesAlquiladas=0;
    }

    ///endregion


    ///region Get and Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Egeneros getGenero() {
        return genero;
    }

    public void setGenero(Egeneros genero) {
        this.genero = genero;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDate getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public String getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(String duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public Eaudiencia getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Eaudiencia audiencia) {
        this.audiencia = audiencia;
    }

    public int getVecesAlquiladas() {
        return vecesAlquiladas;
    }

    public void setVecesAlquiladas(int vecesAlquiladas) {
        this.vecesAlquiladas = vecesAlquiladas;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Film{" +
                "titulo='" + titulo + '\'' +
                ", genero=" + genero +
                ", stock=" + stock +
                ", lanzamiento=" + lanzamiento +
                ", duracionMinutos='" + duracionMinutos + '\'' +
                ", audiencia=" + audiencia +
                ", vecesAlquiladas=" + vecesAlquiladas +
                '}';
    }


    ///endregion


}
