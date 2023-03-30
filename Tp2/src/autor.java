public class autor {

    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    ///Constructor
    public autor() {}


    ///Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getEmail() {
        return email;
    }
    public char getGenero() {
        return genero;
    }



    ///Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    ///Metodos
    public void mostrarAutor (){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Email: "+getEmail());
        System.out.println("Genero: "+getGenero());
    }
}
