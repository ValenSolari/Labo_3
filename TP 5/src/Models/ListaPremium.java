package Models;

import java.util.LinkedList;

public class ListaPremium implements Reproduccion {

    private String nombre;
    private LinkedList<Cancion> MiLista;

    ///region Constructor

    public ListaPremium(String nombre, LinkedList<Cancion> miLista) {
        this.nombre = nombre;
        MiLista = new LinkedList<>();
    }

    public ListaPremium() {
    }
    ///endregion

    //region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Cancion> getMiLista() {
        return MiLista;
    }

    public void setMiLista(LinkedList<Cancion> miLista) {
        MiLista = miLista;
    }

    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "ListaPremium{" +
                "nombre='" + nombre + '\'' +
                ", MiLista=" + MiLista +
                '}';
    }



    @Override
    public String Reproducir() {
        return null;
    }

    @Override
    public void AgregarLista(Cancion x) {

    }

    @Override
    public String EliminarCancion() {
        return null;
    }

    @Override
    public void CambiarCancion() {

    }

    @Override
    public String VerMiLista() {
        return null;
    }

    ///endregion
}