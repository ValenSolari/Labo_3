package Package;

public class Impresora extends Informatica{
    private int paginasXMinuto;

    ///region Constructor


    public Impresora(String nombre, int stock, int precio, String fabricante, int paginasXMinuto) {
        super(nombre, stock, precio, fabricante);
        this.paginasXMinuto = paginasXMinuto;
    }

    public Impresora() {
    }

    ///endregion

    ///region Get and Set

    public int getPaginasXMinuto() {
        return paginasXMinuto;
    }

    public void setPaginasXMinuto(int paginasXMinuto) {
        this.paginasXMinuto = paginasXMinuto;
    }

    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return super.toString() +" Impresora{" +
                "paginas por Minuto= " + paginasXMinuto +
                "} ";
    }


    ///endregion
}
