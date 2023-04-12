package Clases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

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

    ///region Metodos
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
                break;
            }
        }
    }

    public void MostrarClientes (){
        for (Cliente c : ArregloClientes){
            if (c != null ){
                System.out.println(c.toString());
            }
        }
    }



    public Cliente EncontrarCliente (String Nombre){
        int i=-1;
        for (Cliente x : ArregloClientes){
            i++;
            if (Nombre == ArregloClientes[i].getNombre()){
                return ArregloClientes[i];
            }

        }
        return null;
    }

    public void CargarAlquiler (String pelicula, String nombre, LocalDate salida, LocalDate reingreso){

        Scanner leer = new Scanner();
        if (EncontrarCliente(nombre) == null){

            Cliente nuevo = new Cliente();
            System.out.println("Ingrese los datos");
            nuevo.setNombre(leer.next());
            System.out.println("Ingrese telefono");
            nuevo.setTelefono(leer.next());
            System.out.println("Ingrese dirreccion");
            nuevo.setDirreccion(leer.next());

        }


        Alquiler nuevo= new Alquiler(pelicula,nombre,salida,reingreso);


    }











}
