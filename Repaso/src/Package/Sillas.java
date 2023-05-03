package Package;

public class Sillas extends Muebles{
    private boolean ruedas;

    ///region Constructor


    public Sillas(String nombre, int stock, int precio, boolean ruedas) {
        super(nombre, stock, precio);
        this.ruedas = ruedas;
    }

    public Sillas() {
    }
    ///endregion

    ///region Get and Set

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
    }


    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return super.toString()+" Sillas{" +
                "ruedas=" + ruedas +
                "} ";
    }

    @Override
    public void Aumento() {
        System.out.println(toString());
        System.out.println("Precio viejo: "+getPrecio());
        setPrecio(getPrecio()+((getPrecio()*5)/100));
        System.out.println("Precio Nuevo: "+getPrecio());

    }

    ///endregion


}
