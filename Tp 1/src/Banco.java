import javax.naming.AuthenticationException;

public class Banco {

    private int identificador;
    private String nombre;
    private int balance;

    ///Constructores
    public Banco(int balance, String nombre, int identificador) {
        this.balance = balance;
        this.nombre = nombre;
        this.identificador = identificador;
    }



    ///Getters

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBalance() {
        return balance;
    }

    ///Setters

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    ///Metodos

    public int credito (int ingreso){
        int aux=getBalance();
        aux=aux+ingreso;
        setBalance(aux);

        return aux;
    }

    public int debito (int egreso){
        int aux=getBalance();
        aux=aux-egreso;
        setBalance(aux);

        if (aux<0){
            System.out.println("----ADVERTENCIA----");
            System.out.println("SU SALDO ESTA EN NEGATIVO");
        }

        return aux;
    }

    public void mostrar (){
        System.out.println("");
        System.out.println("Identificador = "+getIdentificador());
        System.out.println("Nombre = "+getNombre());
        System.out.println("Balance = "+getBalance());
        System.out.println("");
    }
}
