import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;
import Package.*;

public class Main  {
    public static void main(String[] args) throws CustomExcepcion {
        /*
       int x =0;int i=8;int aux=0;
       x = (int) (Math.random()*(500-1)+1);
        System.out.println("El numero es "+x);
       ///System.out.println("X = "+x);
        do {
            try {
                i=Package.Consola.leerInt("Ingrese el numero: ");
                System.out.println(aproximar(i,x));
                aux++;
            } catch (InputMismatchException ex) {
                System.out.println("!!!!Warning: Se debe ingresar un numero entero");
                Package.Consola.limpiar();
                aux++;
            }
        }while (i!=x);

        System.out.println("Se hizo "+aux+" itetos de adiviar el umero");

         */

        ///Ejercicio 4
        Alumno a = new Alumno("Benjamin", "Paraguay");
        Alumno b = new Alumno("Aristobulo", "Brasil");
        Alumno c = new Alumno("Bautista","Nigeria");
        Alumno d = new Alumno("Valentin","Brasil");

        System.out.println(a.compare(a,b));

        Colegio lista = new Colegio();

        lista.CargarAlumno(a);
        lista.CargarAlumno(b);
        lista.CargarAlumno(c);
        lista.CargarAlumno(d);


        System.out.println(lista.MostrarAlumnos());
        System.out.println(lista.verNacionalidad(null));


        lista.contarNacionalidad("Brasil");

    }




    static public String aproximar (int i, int aux){
        String m= "";
        if (i>aux){
            m="El valor escrito es mayor al generado";
        } else if (i<aux){
            m="El valor escrito es menor al generado";
        }
        return m;
    }


}