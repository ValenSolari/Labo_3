package Clases;

public class Cliente {

    private String nombre;
    private String telefono;
    private String dirreccion;



    public Cliente(String nombre, String telefono, String dirreccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
    }




    ///region get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                '}';
    }
}
