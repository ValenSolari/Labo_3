import Models.clientes;
import Models.cuenta;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        ///Ejercicio 1
        /*
        autor nuevo = new autor();

        nuevo.setNombre("Joshua");
        nuevo.setApellido("Bloch");
        nuevo.setEmail("joshua@gmail.com");
        nuevo.setGenero('M');

        System.out.println("");
        System.out.println("");
        nuevo.mostrarAutor();

        libro nuevoLibro = new libro();

        nuevoLibro.setTitulo("Effective Java");
        nuevoLibro.setPrecio(450);
        nuevoLibro.setStock(150);
        nuevoLibro.setA(nuevo);

        System.out.println("");
        System.out.println("");
        nuevoLibro.mostrarLibro();

        nuevoLibro.setPrecio(500);
        nuevoLibro.setStock(200);

        System.out.println("");
        System.out.println("---------Cambio de precio----------");
        nuevoLibro.mostrarLibro();


        nuevoLibro.mostrarConDetalle();

        */
        ///Ejercicio 2
        //System.out.println(UUID.randomUUID().toString().toUpperCase());
        //System.out.println(LocalDate.now());
        /*

        cliente nuevo = new cliente();

        nuevo.setDescuento(20);
        nuevo.setNombre("Aristobulo");
        nuevo.setEmail("aristo.repiola@gmail.com");

        //System.out.println(nuevo.toString());
        //nuevo.mostrar();

        factura boleta = new factura(nuevo);

        boleta.setMontoTotal(25000);

        System.out.println("Factura 1:");
        boleta.mostrar();

        System.out.println("Monto final "+boleta.precioFinal());
         */

        ///Ejecicio 3

        clientes nuevo = new clientes();

        nuevo.setGenero('F');
        nuevo.setNombre("Maria Isabel");

        System.out.println(nuevo.toString());

        cuenta banco = new cuenta(nuevo,10000);
        banco.depositar(200);
        banco.extrae(1200);

        System.out.println("\n\n");
        System.out.println(banco.toString());
















        }
    }