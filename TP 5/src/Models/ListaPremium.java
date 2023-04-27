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
        Cancion aux=MiLista.getFirst();



        return aux.toString();
    }

    @Override
    public void AgregarLista(Cancion x) {
        MiLista.addLast(x);
    }

    @Override
    public String EliminarCancion() {
        int i;
        for (Cancion x: MiLista){
            System.out.println("1. "+x.toString()+"\n");
        }

        i=Consola.leerInt("indique un numero para borrar la cancion...");

        MiLista.remove(i);
        return VerMiLista();
    }

    @Override
    public void CambiarCancion() {
        Cancion aux=MiLista.getFirst();

        MiLista.remove(aux);
        MiLista.addLast(aux);
    }

    @Override
    public String VerMiLista() {
        String aux ="Lista de Canciones: \n";
        for (Cancion x:MiLista){
            aux += x.toString()+"\n";
        }
        return aux;
    }

    ///endregion
}