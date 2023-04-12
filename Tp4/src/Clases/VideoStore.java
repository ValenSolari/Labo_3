package Clases;

import java.time.LocalDate;
import java.util.Arrays;

public class VideoStore  {

    private Pelicula [] ArregloPeliculas;
    private Cliente [] ArregloClientes;
    private Alquiler []ArregloAlquiler;


    ///region Constructor
    public VideoStore(Pelicula[] arregloPeliculas, Cliente[] arregloClientes) {
        ArregloPeliculas = arregloPeliculas;
        ArregloClientes = arregloClientes;
    }

    public VideoStore() {
    }
    ///endregion

    ///region GET
    public Pelicula[] getArregloPeliculas() {
        return ArregloPeliculas;
    }

    public Cliente[] getArregloClientes() {
        return ArregloClientes;
    }

    public Alquiler[] getArregloAlquiler() {
        return ArregloAlquiler;
    }
    ///endregion


    public void MostrarAlquileres (){
        for (Alquiler x : ArregloAlquiler){
            if (x != null){
                System.out.println(x.toString());
            }
        }
    }
    public void AlquileresActuales (){///Muestra los alquileres que se devuleven en el dia
        for (Alquiler alquiler : ArregloAlquiler){
            if (alquiler.getSalida() == LocalDate.now()){
                System.out.println(alquiler.toString());
            }
        }
    }
    public void MostrarPeliculas (){
        for (Pelicula x: ArregloPeliculas){
            if (x != null){
                System.out.println(x.toString());
            }
        }
    }
    public void AgregarPelicula (String titulo, LocalDate fechaLanzamiento,String Genero, Integer stock, Integer duracion, String calificacion, String paisOrigen){
        Pelicula nueva =new Pelicula(titulo,fechaLanzamiento,Genero,stock,duracion,calificacion,paisOrigen);
        for (int i =0; i < ArregloPeliculas.length ; i++){
            if (ArregloPeliculas[i] == null){
                i++;
                ArregloPeliculas [i]=nueva;
                break;
            }
        }

    }

    public void AgregarCliente (String nombre, String telefono, String dirreccion){
        Cliente nuevo = new Cliente(nombre,telefono,dirreccion);
        for (int i=0; i<ArregloClientes.length ;i++){
            if (ArregloClientes[i]==null){
                ArregloClientes[i]=nuevo;
            }
        }
    }











}
