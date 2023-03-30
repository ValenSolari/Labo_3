public class libro {

    private String titulo;
    private int precio;
    private int stock;
    private autor a;


    ///constructor
    public libro() {}


    ///Getters
    public String getTitulo() {
        return titulo;
    }
    public int getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }
    public autor getA() {
        return a;
    }


    ///Setters
    public void setA(autor a) {
        this.a = a;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    ///Metodos

    public void mostrarLibro (){
        System.out.println("Titulo:\""+getTitulo()+"\"");
        System.out.println("Precio: "+getPrecio());
        System.out.println("Stock: "+getStock());
        a.mostrarAutor();
    }

    public void mostrarConDetalle (){
        System.out.println("El libro, \""+getTitulo()+"\" de "+a.getNombre()+" "+a.getApellido()+". Se vende a "+getPrecio()+" pesos");
    }


}
