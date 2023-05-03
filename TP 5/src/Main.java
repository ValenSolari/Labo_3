import Models.*;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        List <Cancion> ListaCanciones = new ArrayList<>();
        Artista Redondos = new Artista("Patricio",32,"Argentino");
        Album BluesVentanaAzul =new Album("Blues del gato azul", LocalDate.of(2002,02,01),Redondos);
        Cancion a= new Cancion("Me veras",240, Egenero.Rock.getGenero(),null,BluesVentanaAzul);
        Cancion b =new Cancion("Todo un palo",120,Egenero.Rock.getGenero(),null,BluesVentanaAzul);
        Cancion c = new Cancion("Un poco de armor frances",104,Egenero.Rock.getGenero(), null,BluesVentanaAzul);
        ListaBlanca MiLista = new ListaBlanca("Mi lista");

        MiLista.AgregarLista(a);
        MiLista.AgregarLista(b);
        MiLista.AgregarLista(c);

        System.out.println();


        //System.out.println("La lista de reproduccion queda:\n");
        //System.out.println();

        System.out.println(MiLista.VerMiLista());

        System.out.println(MiLista.Reproducir());

        System.out.println(MiLista.VerMiLista());


        System.out.println(MiLista.EliminarCancion());
        System.out.println(MiLista.EliminarCancion());

        System.out.println(MiLista.VerMiLista());









    }

}


