package Package;

public abstract class Productos {
    private String nombre;
    private int stock;
    private int precio;

    private int descuento;
    private int preciofinal;

    ///region constructor

    public Productos(String nombre, int stock, int precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
        this.descuento = 0;
        this.preciofinal = precio;
    }

    public Productos() {
    }

    ///endregion

    ///region get and set


    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getPreciofinal() {
        return preciofinal;
    }

    public void setPreciofinal(int preciofinal) {
        this.preciofinal = preciofinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    ///endregion

    ///region Metodos

    @Override
    public String toString() {
        return "{" +
                "nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                " ,descuento="+ descuento +
                " ,precio Final "+ preciofinal+
                '}';
    }

    public void AplicarDescuento (int descuento){
        setDescuento(descuento);
        setPreciofinal(precio-((precio*descuento)/100));
    }

    public abstract void Aumento();

    ///
}
