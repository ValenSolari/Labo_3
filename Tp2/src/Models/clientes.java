package Models;

import java.util.UUID;

public class clientes {


    private String id;
    private String nombre;
    private Character genero;


    public clientes() {
        this.id= (UUID.randomUUID().toString().toUpperCase());
    }
    public clientes(String name, Character gen) {
        this.id= (UUID.randomUUID().toString().toUpperCase());
        this.genero=gen;
        this.nombre=name;
    }


    public String getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Character getGenero() {
        return genero;
    }
    public void setGenero(Character genero) {
        this.genero = genero;
    }


    public String toString() {
        return "cliente\n" +
                "id='" + id + '\n' +
                ", nombre='" + nombre + '\n' +
                ", genero=" + genero;

    }
}
