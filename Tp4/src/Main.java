import Clases.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pelicula arrayPeliculas [] =new Pelicula [30];

        arrayPeliculas[0]=new Pelicula("Avatar", LocalDate.now(),Genero.Accion,10,240, Audiencia.pg, Pais.EstadosUnidos);

        Cliente arrayClientes [] = new  Cliente[20];
        arrayClientes [0]= new Cliente("Adrian","2233123900","Avenida siemrpe Viva 3100");

        VideoStore Roberto = new VideoStore(arrayPeliculas,arrayClientes);


        //Roberto.MostrarPeliculas();
        Roberto.AgregarPelicula("El hombre araña",LocalDate.of(2008,04,27),Genero.Aventura,10,260,Audiencia.pg_13,Pais.EstadosUnidos);

        Roberto.AgregarCliente("Jorge Perez","2235918779","Calle fatasia 123");
        Roberto.MostrarPeliculas();
        Roberto.MostrarClientes();


    }
}
