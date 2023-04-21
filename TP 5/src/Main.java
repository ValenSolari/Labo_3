import Models.Cancion;
import Models.Consola;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.ConsoleHandler;

public class Main {
    public static void main(String[] args) {
        List <Cancion> ListaCanciones = new ArrayList<>();




    }
    public static void CargarCanciones (List <Cancion> Lista){
        char n='s';
        do {
            Cancion x =new Cancion();
            Consola.escribir("Igrese titulo de la cancion: ");


            Consola.escribir("\nIngrese la duracion de la cancion: ");


            Consola.escribir("\nIngrese el genero de la cancion");


            Consola.escribir("\nDesea seguir ingresando canciones... S/N ");
            Consola.leerString(n);
            Lista.add(x);
        }while (n!='n');

     }
}


