package Clases;

public class Cancion {

    private String nombre;
    private Integer duracion;
    private String genero;
    private Album x;

    ///region Constructores
    public Cancion() {
    }

    public Cancion(String nombre, Integer duracion, String genero, Album x) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.x = x;
    }

    ///endregion

    ///region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Album getX() {
        return x;
    }

    public void setX(Album x) {
        this.x = x;
    }


    ///endregion


    @Override
    public String toString() {
        return "Cancion{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                ", x=" + x +
                '}';
    }
}
