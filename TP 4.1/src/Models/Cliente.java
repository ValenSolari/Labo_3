package Models;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String dirreccion;

    ///region Constructor

    public Cliente(String nombre, String apellido, String telefono, String dirreccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
    }

    public Cliente() {
    }

    ///endregion

    ///region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    ///endregion


    ///region Metodos
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                '}';
    }

    ///endregion


}
