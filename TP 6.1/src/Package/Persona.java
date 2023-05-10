package Package;

import java.util.Objects;
import java.util.UUID;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private int peso;
    private int altura;

    ///region Constructor

    public Persona(String nombre, int edad, String dni, char sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public Persona() {
        this.altura=0;
        this.nombre="";
        this.edad=0;
        this.sexo='H';
        this.peso=0;
        this.dni=generarDni();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        ComprobarSexo(sexo);
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
        this.dni=generarDni();
    }




    ///endregion

    ///region Get ad set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo=ComprobarSexo(sexo);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    ///endregion

    ///region Metodos
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


    @Override
    public int hashCode() {
        return 0;
    }

    public double calcularMC (){

        double m=peso/(Math.pow((double)altura/100,(double)2));
        double aux=0;

        if (m < 20){
            aux=-1;
        } else if (m<= 25 && 20 <=20){
            aux=0;
        }else if (m>25){
            aux=1;
        }
        return aux;
    }

    public void mc(double aux){
        if (aux<0){
            System.out.println("La persona esta por debajo del peso ideal");
        }else if (aux==0){
            System.out.println("La persona esta en su peso ideal");
        }else if (aux>0){
            System.out.println("La persona esta por encima de su peso ideal");
        }
    }

    public boolean esMayordeEdad (){
        boolean aux;
        if (edad >= 18){
            aux=true;
        }
        else {
            aux=false;
        }
        return aux;
    }









    ///endregion
    public static char ComprobarSexo (char sexo){
        if (0!=Character.compare(sexo,'M') && 0!=Character.compare(sexo,'m') ){
            sexo='H';


        }return sexo;
    }
    public static String generarDni (){
        double aux;
        aux= 10000000+Math.random()*99999999;

        String aux1;
        aux1=String.valueOf((int)aux);
        return aux1;

    }
}

