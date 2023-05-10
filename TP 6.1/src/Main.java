import Package.*;

import java.awt.image.ConvolveOp;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Persona nueva = new Persona();

        SetPersona(nueva);


        Persona nueva2 = new Persona();
        nueva2.setEdad(Consola.leerInt("Ingrese edad: "));
        nueva2.setSexo(Consola.leerChar("Ingrese el sexo (H/M): "));
        Consola.limpiar();
        nueva2.setNombre(Consola.leerString("Ingrese el nombre:"));
        nueva2.setPeso(120);
        nueva2.setAltura(150);


        Persona nueva3 = new Persona();


        HashMap<String,Persona> ListadoPersonas= new HashMap<>();

        ListadoPersonas.put(nueva.getDni(),nueva);
        ListadoPersonas.put(nueva2.getDni(),nueva2);
        ListadoPersonas.put(nueva3.getDni(),nueva3);


        System.out.println(nueva.toString());
        mc(ListadoPersonas.get(nueva.getDni()).calcularMC());
        System.out.println("");

        System.out.println(nueva2.toString());
        mc(ListadoPersonas.get(nueva2.getDni()).calcularMC());
        System.out.println("");

        System.out.println(nueva3.toString());
        mc(ListadoPersonas.get(nueva3.getDni()).calcularMC());
        System.out.println("");

    }

    public static void SetPersona (Persona x){
        x.setAltura(Consola.leerInt("Ingrese altura: "));
        x.setEdad(Consola.leerInt("Ingrese edad: "));
        x.setPeso(Consola.leerInt("Ingrese peso: "));
        x.setSexo(Consola.leerChar("Ingrese el sexo (H/M): "));
        Consola.limpiar();
        x.setNombre(Consola.leerString("Ingrese el nombre:"));
    }

    public static void mc(double aux){
        if (aux<0){
            System.out.println("La persona esta por debajo del peso ideal");
        }else if (aux==0){
            System.out.println("La persona esta en su peso ideal");
        }else if (aux>0){
            System.out.println("La persona esta por encima de su peso ideal");
        }
    }

}