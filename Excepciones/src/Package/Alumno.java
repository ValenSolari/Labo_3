package Package;

import java.util.Comparator;

public class Alumno implements Comparator<Alumno> {
    private String nombre;
    private String Nacionalidad;

    ///region constructor
    public Alumno(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.Nacionalidad = nacionalidad;



    }

    public Alumno() {
    }
    ///endregion

    ///region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;

    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", Nacionalidad='" + Nacionalidad + '\'' +
                '}';
    }

    public boolean equals( Object o) {
         if (this==o) return true;
         if (!(o instanceof Alumno)) return false;
         Alumno obj = (Alumno) o;
         return obj.Nacionalidad==getNacionalidad();
    }



    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getNacionalidad().compareTo(o2.getNacionalidad());
    }

    ///endregion
}
