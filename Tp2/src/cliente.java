import java.util.Locale;
import java.util.UUID;

public class cliente {

    private String id;
    private String nombre;
    private String email;
    private int descuento;


    ///Constructor
    public cliente() {
        this.id= (UUID.randomUUID().toString().toUpperCase());
    }


    ///Getters

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getDescuento() {
        return descuento;
    }


    ///Setters
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    ///Metodos

    public void mostrar(){
        System.out.println("Cliente:\n |Id: "+getId()+" |Nombre: "+getNombre()+" |Email: "+getEmail()+" |Descuento: "+getDescuento()+"%.");
    }

    public void mostrarCliente (){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Id: "+getId());
        System.out.println("Email: "+getEmail());
        System.out.println("Descuento: "+getDescuento()+"%");
    }



    public String toString() {
        return "cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
