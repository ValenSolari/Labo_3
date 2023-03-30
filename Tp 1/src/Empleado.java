public class Empleado {
    ///Atributos
    private String dni;
    private String nombre;
    private String apellido;
    private int Salario;

    ///Gets

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalario() {
        return Salario;
    }

    ///Sets

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }


    ///Metodos

    public int calcularSalarioanual (int salario){
        return salario*12;
    }


    public void aumentarSalario (int aumento){
        int salario=getSalario();
        salario=((salario*aumento)/100)+salario;

        setSalario(salario);
    }



    public void mostrar (){
        System.out.println("Nombre "+getNombre());
        System.out.println("Apellido "+getApellido());
        System.out.println("Dni "+getDni());
        System.out.println("Salario "+getSalario());
    }
}
