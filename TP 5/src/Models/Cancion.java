package Models;

public class Cancion  {

    private String titulo;
    private Integer duracion;
    private String genero;
    private Artista invitado;
    private Album perteneciente;

    ///region Constructor


    public Cancion(String titulo, Integer duracion, String genero, Artista invitado, Album perteneciente) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.invitado = invitado;
        this.perteneciente = perteneciente;
    }

    public Cancion() {
    }

    ///endregion

    ///region Get and Set


    public Artista getInvitado() {
        return invitado;
    }

    public void setInvitado(Artista invitado) {
        this.invitado = invitado;
    }

    public Album getPerteneciente() {
        return perteneciente;
    }

    public void setPerteneciente(Album perteneciente) {
        this.perteneciente = perteneciente;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", invitado=" + invitado +
                ", perteneciente=" + perteneciente +
                '}';
    }


    ///endregion




}
