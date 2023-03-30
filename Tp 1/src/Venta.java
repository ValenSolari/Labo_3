public class Venta {

    private int identificador;
    private String descripcion;
    private int cantidad;
    private int precioUnitario;

    ///Getters

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    ///Setters

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    ///Metodos

        public int PrecioTotal (){
            return getCantidad()*getPrecioUnitario();
        }

        public void mostrar (){
            System.out.println("Item Venta = "+getIdentificador());
            System.out.println("Descripcion = "+getDescripcion());
            System.out.println("Cantidad = "+getCantidad());
            System.out.println("Precio unitario = "+getPrecioUnitario());
            System.out.println("Precio total = "+PrecioTotal());
        }
}
