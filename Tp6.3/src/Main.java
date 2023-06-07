import Package.*;

import javax.swing.event.ListDataEvent;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Series> Series = new ArrayList<>();
        List<Videojuego> Games = new ArrayList<>();

        Series a = new Series("The last of us",2,"Accion","Maria isabel");
        Series b = new Series("The witcher",3,"Accion","Mago");
        Series c = new Series("One piece",20,"Anime","Hideo Comgima");
        Series d = new Series("The last of us",2,"Accion","Maria isabel");
        Series e = new Series("Attack on tita",3,"Drama y Accion","El puto amo");
        Series f = new Series("Yo robot",5,"Drama","NPC");

        CargarArraySeries(Series,a);
        CargarArraySeries(Series,b);
        CargarArraySeries(Series,c);
        CargarArraySeries(Series,d);
        CargarArraySeries(Series,e);
        CargarArraySeries(Series,f);

        System.out.println(MonstrarSeries(Series));

        Videojuego g = new Videojuego("Howards Legacy",80,"RPG","Sony");
        Videojuego h = new Videojuego("Grand theaft Auto V",40,"Roleplay","Rockstar");
        Videojuego i = new Videojuego("Asseto Corsa",25,"Simulacion","Gato");
        Videojuego j = new Videojuego("Howards Legacy",80,"RPG","Sony");
        Videojuego k = new Videojuego("The witcher",200,"RPG","CDProjectRed");
        Videojuego l = new Videojuego("Destiny",1000,"RPG","Bundle");

        CargarArraysVideojuegos(Games,g);
        CargarArraysVideojuegos(Games,h);
        CargarArraysVideojuegos(Games,i);
        CargarArraysVideojuegos(Games,j);
        CargarArraysVideojuegos(Games,k);
        CargarArraysVideojuegos(Games,l);

        System.out.println(MostrarVideojuegos(Games));
        Collections.sort(Games);
        System.out.println(MostrarVideojuegos(Games));

        /*
        Series.get(0).Entregar();
        Series.get(3).Entregar();

        Games.get(0).Entregar();
        Games.get(3).Entregar();

        System.out.println("-------------------------------------------------Se entregaron algunas series y juegos-------------------------------------------------");

        System.out.println(MonstrarSeries(Series));
        System.out.println(MostrarVideojuegos(Games));



        int m= ContrarSeriesDevueltas(Series);
        System.out.println("Series devultas = "+m);

        int ñ= ContarVideojuegosDevueltos(Games);
        System.out.println("Videojuegos Devueltos: "+ñ);

         */

    }



    public static String MonstrarSeries (List<Series> serie){
        String aux="";
        for (Series x: serie){
            aux += x.toString()+"\n";
        }
        return aux;
    }

    public static void CargarArraySeries (List<Series> lista, Series a) {
        int flag = 0;

        for (Series x : lista) {
            if (a.equals(x) == true) {
                flag = 1;
            }
        }
        if (flag != 1) {
            lista.add(a);
        }else {
            System.out.println("-------------------------------------------------");
            System.out.println("Error, serie ya cargada \n"+ a.toString());
            System.out.println("-------------------------------------------------");
        }
    }

    public static String MostrarVideojuegos (List<Videojuego> games){
        String aux="";

        for ( Videojuego x : games){
            aux += x.toString()+ "\n";
        }
        return aux;
    }

    public static void CargarArraysVideojuegos (List<Videojuego> lista,Videojuego a){
        int flag=0;

        for (Videojuego x : lista){
            if(a.equals(x)==true){
                flag = 1;
            }
        }
        if (flag != 1 ){
            lista.add(a);
        }else {
            System.out.println("-------------------------------------------------");
            System.out.println("Error, serie ya cargada \n"+ a.toString());
            System.out.println("-------------------------------------------------");
        }
    }

    public static int ContrarSeriesDevueltas (List<Series> lista){
        int i=0;
        System.out.println("\n\n---------------------------------------------Series devulta" +
                "s:---------------------------------------------\n\n");
        for (Series x : lista){
            if (x.isEtregado() == true){
                System.out.println(x.toString());
                i++;
            }
        }
        return i;
    }

    public static int ContarVideojuegosDevueltos (List<Videojuego> lista){
        int i=0;
        System.out.println("\n\n---------------------------------------------Videojuegos devultos" +
                "s:---------------------------------------------\n\n");

        for (Videojuego x : lista){
            if (x.isEtregado() == true){
                System.out.println(x.toString());
                i++;
            }
        }
        return i;
    }

}