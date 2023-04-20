import Models.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VideoStore Roberto = new VideoStore();

        Film x = new Film("Avatar",Egeneros.Accion,20, LocalDate.of(2008,05,27),"360", Eaudiencia.G);
        Roberto.CargarFilm(x);
        Roberto.CargarFilm(new Film("El hombre araña",Egeneros.Accion,1,LocalDate.of(2004,10,02),"140",Eaudiencia.PG));
        Roberto.CargarFilm(new Film("Matrix",Egeneros.Aventura,5,LocalDate.of(2004,06,18),"164",Eaudiencia.G));

        Cliente a =new Cliente("Jose luis","Kenobi","2233123900","El culo del mundo");
        Cliente b =new Cliente("Marta","SeteveLatanga","123123400","Muy lejos");

        Roberto.CargarCliente(a);
        Roberto.CargarAlquiler(new Alquiler("Avatar",a,LocalDate.of(2023,03,24),LocalDate.of(2023,04,20)));
        Cliente c = new Cliente("Valentin VaRapidin","Picante","Muchos numeros","En mi casa");
        Roberto.CargarAlquiler(new Alquiler("El hombre araña",c,LocalDate.of(2023,04,15),LocalDate.of(2023,04,18)));
        Roberto.CargarAlquiler(new Alquiler("Matrix",b,LocalDate.now(),LocalDate.of(2023,04,16)));


        System.out.println("\n-------------------Films-------------------\n");
        System.out.println(Roberto.MostrarFilms());

        System.out.println("\n-------------------Films-------------------\n");
        System.out.println(Roberto.MostrarFilms());


        System.out.println("\n-------------------Clientes-------------------\n");
        System.out.println(Roberto.MostrarClientes());
        System.out.println("\n-------------------Alquileres-------------------\n");
        System.out.println(Roberto.MostrarAlquileres());

        System.out.println("\n------------------- Alquileres Vigentes -------------------\n");
        System.out.println(Roberto.AlquileresVigenetes());




    }
}