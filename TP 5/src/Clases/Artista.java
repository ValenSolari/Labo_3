package Clases;

public class Artista {
    private String nombre;
    private Integer edad;
    private String nacionalidad;

    ///region Constructores
    public Artista() {
    }

    public Artista(String nombre, Integer edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    ///endregion

    ///region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    ///endregion


    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
