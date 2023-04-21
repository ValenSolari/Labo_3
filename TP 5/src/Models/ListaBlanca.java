package Models;

import java.util.Stack;

public class ListaBlanca implements Reproduccion{

    private String nombre;
    private Stack<Cancion> MiLista;

    ///region Constructores

    public ListaBlanca(String nombre, Stack<Cancion> miLista) {
        this.nombre = nombre;
        MiLista = new Stack<>();
    }

    public ListaBlanca() {
    }

    ///endregion

    ///region Get and Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stack<Cancion> getMiLista() {
        return MiLista;
    }

    public void setMiLista(Stack<Cancion> miLista) {
        MiLista = miLista;
    }

    ///endregion

    ///region Metodos

    @Override
    public String Reproducir () {
        Cancion aux;
        Stack<Cancion> auxiliar=new Stack<>();

        while (!MiLista.empty()){
            Cancion pase = new Cancion();
            pase=MiLista.pop();
            auxiliar.push(pase);
        }

        aux=auxiliar.peek();
        auxiliar.pop();
        while (!auxiliar.empty()){
            Cancion pase;
            pase=auxiliar.pop();
            MiLista.push(pase);
        }
        MiLista.push(aux);

        return aux.toString();
    }

    @Override
    public void AgregarLista(Cancion x) {
        MiLista.push(x);
    }

    @Override
    public String EliminarCancion() {
        return "-------------Esta opcion solo se puede utilizar en la version Premium---------";
    }

    @Override
    public void CambiarCancion() {
        System.out.println("-------------Esta opcion solo se puede utilizar en la version Premium---------");
    }

    @Override
    public String VerMiLista() {
        return "Mi lista = "+MiLista;
    }

    @Override
    public String toString() {
        return "ListaBlanca{" +
                "nombre='" + nombre + '\'' +
                ", MiLista=" + MiLista +
                '}';
    }

    ///endregion
}
