package Package;

public class Escritorios extends Muebles{

    private int ancho;
    private int alto;

    ///region Constructor


    public Escritorios(String nombre, int stock, int precio, int ancho, int alto) {
        super(nombre, stock, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Escritorios() {

    }


    ///endregion

    ///region Get and Set

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return super.toString()+" Escritorios{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                "} ";
    }

    @Override
    public void Aumento() {
        System.out.println(toString());
        System.out.println("Precio viejo: "+getPrecio());
        setPrecio(getPrecio()+((getPrecio()*10)/100));
        System.out.println("Precio Nuevo: "+getPrecio());
    }


    ///endregion
}
