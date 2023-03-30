import java.time.LocalDate;

public class factura {

    private cliente x;
    private LocalDate fecha;

    private int montoTotal;

    ///Constructor
    public factura(cliente a) {
        this.x = a;
        this.fecha = LocalDate.now();
    }


    ///Getters
    public cliente getX() {
        return x;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getMontoTotal() {
        return montoTotal;
    }



    ///Setters
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setX(cliente x) {
        this.x = x;
    }
    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }



    ///Metodos
    public float precioFinal (){
        float aux;
        aux=(float)(montoTotal*x.getDescuento())/100;
        aux=montoTotal-aux;
        return aux;
    }

    public void mostrar (){
        System.out.println("Fecha: "+getFecha());
        System.out.println("Monto Total: "+getMontoTotal());
        x.mostrarCliente();

    }

}
