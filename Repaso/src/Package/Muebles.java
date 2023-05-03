package Package;

public class Muebles extends Productos{

    ///region Constructor

    public Muebles(String nombre, int stock, int precio) {
        super(nombre, stock, precio);
    }

    public Muebles() {
    }
    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Aumento(){};
    ///endregion
}
