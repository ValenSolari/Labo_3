package Models;

import java.security.PublicKey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class VideoStore {
    private ArrayList <Alquiler> arregloAlquileres;
    private ArrayList <Cliente> arregloClientes;
    private ArrayList <Film> arregloFilm;

    ///region Constructores

    public VideoStore() {
        this.arregloAlquileres = new ArrayList<>();
        this.arregloClientes = new ArrayList<>();
        this.arregloFilm = new ArrayList<>();
    }

    ///endregion

    ///region Get and Set

    public ArrayList<Alquiler> getArregloAlquileres() {
        return arregloAlquileres;
    }

    public void setArregloAlquileres(ArrayList<Alquiler> arregloAlquileres) {
        this.arregloAlquileres = arregloAlquileres;
    }

    public ArrayList<Cliente> getArregloClientes() {
        return arregloClientes;
    }

    public void setArregloClientes(ArrayList<Cliente> arregloClientes) {
        this.arregloClientes = arregloClientes;
    }

    public ArrayList<Film> getArregloFilm() {
        return arregloFilm;
    }

    public void setArregloFilm(ArrayList<Film> arregloFilm) {
        this.arregloFilm = arregloFilm;
    }


    ///endregion

    ///region Metodos

    public String MostrarClientes (){
        String aux = "";
        for (Cliente x:arregloClientes){
            aux= aux+ x.toString()+"\n";
        }
        return aux;
    }

    public String MostrarAlquileres (){
        String aux ="";
        for (Alquiler x: arregloAlquileres){
            aux= aux + x.toString()+"\n";
        }
        return aux;
    }

    public String MostrarFilms (){
        String aux="";
        for (Film x:arregloFilm){
            aux = aux+x.toString()+"\n";
        }
        return aux;
    }

    public void CargarCliente (Cliente x){
        arregloClientes.add(x);
    }


    public Cliente buscarCliente (String nombre, String apellido){
        Cliente x = null;
        for (Cliente y:arregloClientes){
            if (y.getApellido().equals(apellido)== true && y.getNombre().equals(nombre)==true){
                x = y;
            }
        }
        return x;
    }

    public Film buscarFilm (String titulo){
        Film valor = null;
        for (Film x: arregloFilm){
            if (x.getTitulo().equals(titulo) == true){
                valor=x;
            }
        }
        return valor;
    }

    public void CargarAlquiler (Alquiler x){
        Film seleccionado = buscarFilm(x.getTitulo());
        if (seleccionado == null){
            System.out.println("\nEl film "+x.getTitulo()+" no se encuentra" );
        } else {
            if (seleccionado.getStock() > 0){
                if (buscarCliente(x.getX().getNombre(),x.getX().getApellido()) == null) {
                    arregloClientes.add(x.getX());
                }

                    arregloAlquileres.add(x);
                    seleccionado.setStock(seleccionado.getStock()-1);
                    seleccionado.setVecesAlquiladas(seleccionado.getVecesAlquiladas()+1);

                }
            else{
                System.out.println("No hay copias disponibles de la pelicula "+x.getTitulo());
            }

        }
    }

    public void CargarFilm (Film x){
        arregloFilm.add(x);
    }

    public String AlquileresVigenetes (){
        String aux = "";
        for (Alquiler x : arregloAlquileres){
            if (x.getReingreso().compareTo(LocalDate.now()) > 0){
                aux= aux + x.toString()+"\n";
            }
        }
        return aux;
    }

    public String AlquileresDelDia (){
        String aux = "";
        for (Alquiler x : arregloAlquileres){
            if (x.getReingreso().compareTo(LocalDate.now()) == 0){
                aux= aux + x.toString()+"\n";
            }
        }
        return aux;
    }

    //public String Ultimos10FilmDeUnCliente (Cliente x){;





    ///endregion
}
