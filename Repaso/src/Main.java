import Package.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Productos> Inventario = new ArrayList<>();
        Escritorios e= new Escritorios("Escritorio",10,200,20,10);
        Sillas s = new Sillas("Silla",10,20,true);
        Impresora i = new Impresora("Impresora",10,75,"Hp",250);
        Notebook n = new Notebook("Notebook",10,300,"Lenovo",16);


        Inventario.add(e);
        Inventario.add(s);
        Inventario.add(i);
        Inventario.add(n);

        Inventario.get(0).AplicarDescuento(10);
        System.out.println(MostrarInventario(Inventario));

        for (Productos producto:Inventario){
            producto.Aumento();
        }

        System.out.println(MostrarInventario(Inventario));


    }
    public static String MostrarInventario (List <Productos> inventario ){
        String aux = "";
        for (Productos producto : inventario){
            aux += producto.toString();
            aux += "\n";
        }
        return aux;
    }


}